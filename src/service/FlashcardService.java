package service;

import java.util.*;
import model.*;

public class FlashcardService {

    private Map<String, Flashcard> cards = new HashMap<>();
    private int idCounter = 1;

    public void addCard(String q, String a) {
        String id = "FC" + idCounter++;
        cards.put(id, new Flashcard(q, a));
        System.out.println("Saved with ID: " + id);
    }

    public void listCards() {
        if (cards.isEmpty()) {
            System.out.println("No flashcards available.");
            return;
        }

        for (String id : cards.keySet()) {
            System.out.println(id + " -> " + cards.get(id));
        }
    }

    public void reviewCard(String id) {
        Flashcard card = cards.get(id);

        if (card == null)
            throw new DomainException("Flashcard not found");

        card.review();
    }

    public void search(String keyword) {
        boolean found = false;

        for (String id : cards.keySet()) {
            Flashcard card = cards.get(id);

            if (card.getQuestion().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(id + " -> " + card);
                found = true;
            }
        }

        if (!found)
            System.out.println("No matching flashcards found.");
    }

    public void mostReviewed() {
        Flashcard max = null;

        for (Flashcard card : cards.values()) {
            if (max == null || card.getReviewCount() > max.getReviewCount()) {
                max = card;
            }
        }

        if (max == null)
            System.out.println("No flashcards yet.");
        else
            System.out.println("Most Reviewed: " + max);
    }
}