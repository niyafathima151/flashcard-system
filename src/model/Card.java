package model;

public class Card {

    private String question;
    private String answer;

    public Card(String question, String answer) {

        if(question == null || question.isBlank())
            throw new IllegalArgumentException("Question cannot be empty");

        this.question = question.trim();
        this.answer = answer.trim();
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}