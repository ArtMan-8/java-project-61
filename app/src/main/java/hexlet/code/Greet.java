package hexlet.code;

public class Greet {
    private static String userName;

    public static String getUserName() {
        return userName;
    }

    public static void user() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String enteredName = Utils.readNextLine();
        userName = enteredName;
        System.out.println("Hello, " + enteredName + "!");
    }
}
