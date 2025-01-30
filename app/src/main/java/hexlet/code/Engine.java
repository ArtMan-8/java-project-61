package hexlet.code;

public class Engine {
    public static final int GAME_ROUNDS = 3;

    public static void start(String rule, String[][] rounds) {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        String userName = Utils.readNextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = Utils.readNextLine();

            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
