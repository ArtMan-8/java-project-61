package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    private static String userName;

    public static void setUserName(String userName) {
        Greet.userName = userName;
    }

    public static String getUserName() {
        return userName;
    }

    public static void user() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String enteredName = scanner.nextLine();
        setUserName(enteredName);
        System.out.println("Hello, " + enteredName + "!");
    }
}
