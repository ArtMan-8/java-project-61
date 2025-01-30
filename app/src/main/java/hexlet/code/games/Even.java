package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int HUNDRED_NUMBER = 100;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int randomNumber = Utils.getRandomNumber(0, HUNDRED_NUMBER);
            String question = Integer.toString(randomNumber);
            String answer = randomNumber % 2 == 0 ? "yes" : "no";

            rounds[i] = new String[]{question, answer};
        }

        return rounds;
    }

    public static void play() {
        Engine.start(GAME_RULE, generateRounds(Engine.GAME_ROUNDS));
    }
}
