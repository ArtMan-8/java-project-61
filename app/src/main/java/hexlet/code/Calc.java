package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static final char[] operators = {'+', '-', '*'};

    private static final Random random = new Random();

    private static int getRandomNumber() {
        return random.nextInt(100);
    }

    private static char getRandomOperator() {
        int operatorIndex = random.nextInt(0 ,3);
        return operators[operatorIndex];
    }

    private static int getCalculation(int first, int second, char operation) {
        switch (operation) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            default:
                return 0;
        }
    }

    public static void start() {
        int questionNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the result of the expression?");

        while (questionNumber < 3) {
            int randomFirstNumber = getRandomNumber();
            int randomSecondNumber = getRandomNumber();
            char operation = getRandomOperator();

            int correctAnswer = getCalculation(randomFirstNumber, randomSecondNumber, operation);

            System.out.println("Question: " + randomFirstNumber + " " + operation + " " + randomSecondNumber);
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            if (answer == correctAnswer) {
                System.out.println("Correct!");
                questionNumber += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Greet.getUserName() + "!");
                break;
            }
        }
        System.out.println("Congratulations, " + Greet.getUserName() + "!");
    }
}