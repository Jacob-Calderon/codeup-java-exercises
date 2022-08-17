package util;
import java.util.Scanner;
import java.lang.String;
import java.lang.Integer;

public class Input {
    private static Scanner scanner;

    public static String getString() {
        System.out.println("Please Enter Text\n");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.println("Continue? [Y/N]");
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.contains("y");
    }

    public static int getInt() {
        System.out.println("Please Enter a whole number");
        scanner = new Scanner(System.in);
        int input;
//        int input = scanner.nextInt();
        try {
            input = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.print("Type conversion error, variable defaulted to Zero.\n");
            input = 0;
        }
        return input;
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please enter a whole number between %s and %s\n", min, max);
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return (input <= max && input >= min) ? input : getInt(min, max);
    }

    public static double getDouble() {
        System.out.println("Please enter a number");
        scanner = new Scanner(System.in);
//        double input = scanner.nextDouble();
        double input;
        try {
            input = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.print("Type conversion error, variable defaulted to Zero.\n");
            input = 0.00;
        }
        return input;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %.0f and %.0f", min, max);
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return (input <= max && input >= min) ? input : getDouble(min, max);
    }


  //Improve your Input class.
    //
    //Your getInt and getDouble methods should make sure that the value returned from
    // the method is actually an int or a double. You can do this by replacing the use of the
    // Scanner nextInt() and nextDouble() methods with the existing getString() method you
    // created in a previous exercise using the following methods to convert the returned
    // String into the desired datatype:
    //
    //Copied to clipboard
    //Integer.valueOf(String s);
    //Double.valueOf(String s);
    //Note these methods will throw a NumberFormatException if the given
    // input cannot be parsed as an int or double. Your methods on the Input class
    // should handle these exceptions, you can use a try-catch for this.
}


