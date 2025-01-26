package hexlet.code.games;

import java.util.Random;

public class Prime implements Game{
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int randomNumber = this.random.nextInt(100);
        String question = Integer.toString(randomNumber);
        this.answer = isPrime(randomNumber) ? "yes" : "no";

        return question;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
