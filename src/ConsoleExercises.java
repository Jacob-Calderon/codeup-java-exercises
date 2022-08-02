import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        // todo: The value of pi is approximately 3.14.
        // System.out.format
        System.out.println("Who wants some pi?" + pi);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int userInput = scanner.nextInt();

        System.out.println("This is what you have entered: " + userInput);

        System.out.println("Enter 3 words: ");
        String firstUserInput = scanner.next();
        String secondUserInput = scanner.next();
        String thirdUserInput = scanner.next();

        System.out.println("Enter width: ");
        System.out.println("Enter length: ");
        System.out.println("Enter height: ");

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println("This is your area: " + (width * length) + "ftSq");
        System.out.println("This is the perimeter: " + ((width * 2) + (length * 2)) + "Feet");
        System.out.println("This is the volume: " + (width * length * height) + " cubic cm" );

        scanner.useDelimiter("\n");
    }
}
