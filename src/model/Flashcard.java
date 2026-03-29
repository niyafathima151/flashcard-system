package model;

public class Flashcard extends Card implements Reviewable {

    private int reviewCount;

    public Flashcard(String q, String a) {
        super(q, a);   // ✅ FIXED
        this.reviewCount = 0;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    @Override
    public void review() {
        System.out.println("Q: " + getQuestion());
        System.out.println("A: " + getAnswer());  // from Card
        reviewCount++;
    }

    @Override
    public String toString() {
        return getQuestion() + " | Answer: " + getAnswer() + " | Reviews: " + reviewCount;
    }
}