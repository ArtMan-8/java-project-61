package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Game;
import hexlet.code.games.Greet;


public class Engine {
    private static final int GAME_ROUNDS = 3;

    public static void play(Game game) {
        int gameRound = 1;

        Greet.user();

        Scanner scanner = new Scanner(System.in);
        System.out.println(game.getRule());

        while (gameRound <= GAME_ROUNDS) {
            String question = game.getQuestion();
            String correctAnswer = game.getAnswer();

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }

            System.out.println("Correct!");
            gameRound += 1;
        }

        if (gameRound > GAME_ROUNDS) {
            System.out.println("Congratulations, " + Greet.getUserName() + "!");
        } else {
            System.out.println("Let's try again, " + Greet.getUserName() + "!");
        }

        scanner.close();
    }
}
