import java.util.Scanner;
import java.util.InputMismatchException;

public class ComparisonOperators {
    public static void main(String[] args) {
        // Storing data
        int age = 0;
        Scanner input = new Scanner(System.in); // Init method scanner

        // Inputting data
        boolean validInput = false;
        while (!validInput) {
            System.out.print("How old are you? ");

            // Adding exception to check if user added invalid input
            try {
                age = input.nextInt();
                validInput = true; // Exit loop if input is valid
            } catch (InputMismatchException ex) {
                System.out.println("Enter just integer values");
                input.next(); // Clear invalid input
            }
        }

        // Comparison operation
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age > 18) {
            System.out.println("You are of legal age");
        } else {
            System.out.println("You are exactly 18 years old");
        }

        // Closing scanner
        input.close();
    }
}