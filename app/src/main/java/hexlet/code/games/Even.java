package hexlet.code.games;

import java.util.Random;

public class Even implements Game {
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int randomNumber = getRandomNumber();
        String question = Integer.toString(randomNumber);
        this.answer = randomNumber % 2 == 0 ? "yes" : "no";

        return question;
    }

    private int getRandomNumber() {
        return this.random.nextInt(100);
    }
}