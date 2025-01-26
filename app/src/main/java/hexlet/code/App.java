package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 5:
                Engine.play(new Progression());
                break;
            case 4:
                Engine.play(new GCD());
                break;
            case 3:
                Engine.play(new Calc());
                break;
            case 2:
                Engine.play(new Even());
                break;
            case 1:
                Greet.user();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Unknown game: " + choice);
                System.exit(0);
        }

        scanner.close();
    }
}
