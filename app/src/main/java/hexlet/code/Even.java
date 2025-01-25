package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final Random random = new Random();

    private static int getRandomNumber() {
        return random.nextInt(100);
    }

    public static void start() {
        int questionNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (questionNumber < 3) {
            int randomNumber = getRandomNumber();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                questionNumber += 1;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }
        System.out.println("Congratulations, " + Greet.getUserName() + "!");
    }
}