package hexlet.code;

public class Engine {
    public static final int GAME_ROUNDS = 3;

    public static void start(String rule, String[][] rounds) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.readNextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        int gameRound = 0;
        while (gameRound < GAME_ROUNDS) {
            String question = rounds[gameRound][0];
            String correctAnswer = rounds[gameRound][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = Utils.readNextLine();

            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                break;
            }

            System.out.println("Correct!");
            gameRound += 1;
        }

        if (gameRound == GAME_ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
