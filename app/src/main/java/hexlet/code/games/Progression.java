package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int TEN_NUMBER = 10;
    private static final int HUNDRED_NUMBER = 100;
    private static final String GAME_RULE = "What number is missing in the progression?";

    private static String[] createProgression(int start, int step, int length) {
        String[] numbers = new String[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = String.valueOf(start + i * step);
        }

        return numbers;
    }

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int startNumber = Utils.getRandomNumber(0, HUNDRED_NUMBER);
            int progressionStep = Utils.getRandomNumber(1, TEN_NUMBER);
            int progressionLength = Utils.getRandomNumber(TEN_NUMBER / 2, TEN_NUMBER * 2);
            int hideIndex = Utils.getRandomNumber(0, progressionLength - 1);

            String answer = String.valueOf(startNumber + hideIndex * progressionStep);

            String[] numbers = createProgression(startNumber, progressionStep, progressionLength);
            numbers[hideIndex] = "..";

            rounds[i] = new String[]{String.join(" ", numbers), answer};
        }

        return rounds;
    }

    public static void play() {
        Engine.start(GAME_RULE, generateRounds(Engine.GAME_ROUNDS));
    }
}
