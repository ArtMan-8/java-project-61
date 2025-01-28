package hexlet.code;

public class Greet {
    public static void user() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.readNextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
