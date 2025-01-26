package hexlet.code.games;

import java.util.Random;

public class GCD implements Game {
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int randomFirstNumber = this.random.nextInt(10, 100);
        int randomSecondNumber = this.random.nextInt(100, 1000);

        String question = randomFirstNumber + " " + randomSecondNumber;
        int answer = this.getGCD(randomFirstNumber, randomSecondNumber);
        this.answer = Integer.toString(answer);

        return question;
    }

    private int getGCD(int first, int second) {
        if (second == 0) {
            return first;
        }

        return getGCD(second, first % second);
    }
}
