package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Utils {
    private static Scanner scanner;

    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(min, max);
    }

    public static String readNextLine() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner.nextLine();
    }

    public static void systemExit() {
        scanner.close();
        System.exit(0);
    }
}
