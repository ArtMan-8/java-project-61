package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    private final Random random = new Random();

    private String answer = "";

    public String getRule() {
        return "What is the result of the expression?";
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        int randomFirstNumber = this.random.nextInt(0, 50);
        int randomSecondNumber = this.random.nextInt(50, 100);
        char operation = this.getRandomOperator();

        String question = randomFirstNumber + " " + operation + " " + randomSecondNumber;
        int answer = this.getCalculation(randomFirstNumber, randomSecondNumber, operation);
        this.answer = Integer.toString(answer);

        return question;
    }

    private char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int operatorIndex = this.random.nextInt(0 ,3);
        return operators[operatorIndex];
    }

    private int getCalculation(int first, int second, char operation) {
        return switch (operation) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            default -> 0;
        };
    }
}