package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int TEN_NUMBER = 100;

    private static final int HUNDRED_NUMBER = 100;

    private static String getRule() {
        return "What number is missing in the progression?";
    }

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int startNumber = Utils.getRandomNumber(0, HUNDRED_NUMBER);
            int progressionStep = Utils.getRandomNumber(1, TEN_NUMBER);
            int progressionLength = Utils.getRandomNumber(TEN_NUMBER / 2, TEN_NUMBER * 2);
            int hideIndex = Utils.getRandomNumber(0, progressionLength - 1);

            StringBuilder question = new StringBuilder();
            String answer = "";

            for (int j = 0; j < progressionLength; j++) {
                int currentNumber = startNumber + j * progressionStep;

                if (j == hideIndex) {
                    answer = Integer.toString(currentNumber);
                    question.append(".. ");
                } else {
                    question.append(currentNumber).append(" ");
                }
            }

            rounds[i] = new String[]{question.toString(), answer};
        }

        return rounds;
    }

    public static void play() {
        Engine.start(getRule(), generateRounds(Engine.GAME_ROUNDS));
    }
}
