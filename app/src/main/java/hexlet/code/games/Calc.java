package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int FIVE_NUMBER = 5;

    private static final int TEN_NUMBER = 10;

    private static String getRule() {
        return "What is the result of the expression?";
    }

    private static String[][] generateRounds(int count) {
        String[][] rounds = new String[count][2];

        for (int i = 0; i < count; i++) {
            int randomFirstNumber = Utils.getRandomNumber(0, FIVE_NUMBER);
            int randomSecondNumber = Utils.getRandomNumber(FIVE_NUMBER, TEN_NUMBER);
            char operation = getRandomOperator();

            String question = randomFirstNumber + " " + operation + " " + randomSecondNumber;
            String answer = Integer.toString(getCalculation(randomFirstNumber, randomSecondNumber, operation));

            rounds[i] = new String[]{question, answer};
        }

        return rounds;
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int operatorIndex = Utils.getRandomNumber(0, operators.length);
        return operators[operatorIndex];
    }

    private static int getCalculation(int first, int second, char operation) {
        return switch (operation) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            default -> 0;
        };
    }

    public static void play() {
        Engine.start(getRule(), generateRounds(Engine.GAME_ROUNDS));
    }
}
