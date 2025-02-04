package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int HUNDRED_NUMBER = 100;
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int randomNumber = Utils.getRandomNumber(0, HUNDRED_NUMBER);
            String question = Integer.toString(randomNumber);
            String answer = isPrime(randomNumber) ? "yes" : "no";

            rounds[i] = new String[]{question, answer};
        }

        return rounds;
    }

    private static boolean isPrime(int number) {
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

    public static void play() {
        Engine.start(GAME_RULE, generateRounds(Engine.GAME_ROUNDS));
    }
}
