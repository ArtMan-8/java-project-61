package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class App {
    private static final int GAME_PRIME = 6;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_GCD = 4;
    private static final int GAME_CALC = 3;
    private static final int GAME_EVEN = 2;
    private static final int GAME_GREET = 1;
    private static final int GAME_QUIT = 0;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String choice = Utils.readNextLine();
        System.out.println();

        switch (Integer.parseInt(choice)) {
            case GAME_PRIME:
                Prime.play();
                break;
            case GAME_PROGRESSION:
                Progression.play();
                break;
            case GAME_GCD:
                GCD.play();
                break;
            case GAME_CALC:
                Calc.play();
                break;
            case GAME_EVEN:
                Even.play();
                break;
            case GAME_GREET:
                Greet.user();
                break;
            case GAME_QUIT:
                break;
            default:
                System.out.println("Unknown game: " + choice);
        }

        Utils.systemExit();
    }
}
