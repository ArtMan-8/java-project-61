package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "What is the result of the expression?";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int randomFirstNumber = this.getRandomNumber();
        int randomSecondNumber = this.getRandomNumber();

        String question = randomFirstNumber + " " + randomSecondNumber;
        int answer = this.getGCD(randomFirstNumber, randomSecondNumber);
        this.answer = Integer.toString(answer);

        return question;
    }

    private int getRandomNumber() {
        return this.random.nextInt(100);
    }

    private int getGCD(int first, int second) {
        if (second == 0) {
            return first;
        }

        return getGCD(second, first % second);
    }
}
