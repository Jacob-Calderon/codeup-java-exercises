import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        // todo: The value of pi is approximately 3.14.
        // System.out.format
        System.out.println("Who wants some pi?" + pi);
        Scanner scanner = new Scanner(System.in);
//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//
// todo: What happens if you input something that is not an integer?
        System.out.print("Enter a Number: ");
        int userInput = scanner.nextInt();
//Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//todo: What happens if you enter less than 3 words? does not return
//todo: What happens if you enter more than 3 words? only returns first three
        scanner.nextLine();
        System.out.println("This is what you have entered: " + userInput);

        System.out.println("Enter 3 words: ");
        String firstUserInput = scanner.next();
        String secondUserInput = scanner.next();
        String thirdUserInput = scanner.next();
//todo: Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//todo: Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.
        scanner.nextLine();

        System.out.println("Enter width: ");
        System.out.println("Enter length: ");
        System.out.println("Enter height: ");

        double width = scanner.nextDouble();
        double length = scanner.nextDouble();
        double height = scanner.nextDouble();
//todo: Display the area and perimeter of that classroom.
//
// The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width
        scanner.nextLine();
        System.out.println("This is your area: " + (width * length) + "ftSq");
        System.out.println("This is the perimeter: " + ((width * 2) + (length * 2)) + "Feet");
        System.out.println("This is the volume: " + (width * length * height) + " cubic cm" );

        scanner.useDelimiter("\n\n");
    }
}
