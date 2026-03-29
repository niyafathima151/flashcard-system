package app;

import java.util.Scanner;
import service.FlashcardService;
import service.DomainException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlashcardService svc = new FlashcardService();

        while (true) {

            System.out.println("\n=== Flashcard System ===");
            System.out.println("1 Add Flashcard");
            System.out.println("2 View Flashcards");
            System.out.println("3 Review Flashcard");
            System.out.println("4 Search Flashcard");
            System.out.println("5 Most Reviewed");
            System.out.println("6 Exit");

            System.out.print("Choose: ");
            String choice = sc.nextLine();

            try {

                switch (choice) {

                    case "1":
                        System.out.print("Question: ");
                        String q = sc.nextLine();

                        System.out.print("Answer: ");
                        String a = sc.nextLine();

                        svc.addCard(q, a);
                        System.out.println("Flashcard added.");
                        break;

                    case "2":
                        svc.listCards();
                        break;

                    case "3":
                        System.out.print("Flashcard ID: ");
                        String id = sc.nextLine();

                        svc.reviewCard(id);
                        break;

                    case "4":
                        System.out.print("Keyword: ");
                        String k = sc.nextLine();

                        svc.search(k);
                        break;

                    case "5":
                        svc.mostReviewed();
                        break;

                    case "6":
                        System.out.println("Bye!");
                        sc.close();   // ✅ added
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch (DomainException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}