package hexlet.code.games;

import java.util.Random;

public class Progression implements Game {
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "What number is missing in the progression?";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int startNumber = this.random.nextInt(0, 100);
        int progressionStep = this.random.nextInt(1, 10);
        int progressionLength = this.random.nextInt(5, 15);
        int hideIndex = this.random.nextInt(0, progressionLength - 1);

        StringBuilder question = new StringBuilder();

        for (int i = 0; i < progressionLength; i++) {
            int currentNumber = startNumber + i * progressionStep;

            if (i == hideIndex) {
                this.answer = Integer.toString(currentNumber);
                question.append(".. ");
            } else {
                question.append(currentNumber).append(" ");
            }
        }

        return question.toString();
    }
}
