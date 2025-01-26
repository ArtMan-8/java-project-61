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
        int randomFirstNumber = this.getRandomNumber();
        int randomSecondNumber = this.getRandomNumber();
        char operation = this.getRandomOperator();

        String question = randomFirstNumber + " " + operation + " " + randomSecondNumber;
        int answer = this.getCalculation(randomFirstNumber, randomSecondNumber, operation);
        this.answer = Integer.toString(answer);

        return question;
    }

    private int getRandomNumber() {
        return this.random.nextInt(100);
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