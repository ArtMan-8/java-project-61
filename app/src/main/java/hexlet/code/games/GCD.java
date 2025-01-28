package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int TEN_NUMBER = 10;

    private static final int HUNDRED_NUMBER = 100;

    private static String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int randomFirstNumber = Utils.getRandomNumber(0, TEN_NUMBER);
            int randomSecondNumber = Utils.getRandomNumber(TEN_NUMBER, HUNDRED_NUMBER);

            String question = randomFirstNumber + " " + randomSecondNumber;
            String answer = Integer.toString(getGCD(randomFirstNumber, randomSecondNumber));

            rounds[i] = new String[]{question, answer};
        }

        return rounds;
    }

    private static int getGCD(int first, int second) {
        if (second == 0) {
            return first;
        }

        return getGCD(second, first % second);
    }

    public static void play() {
        Engine.start(getRule(), generateRounds(Engine.GAME_ROUNDS));
    }
}
