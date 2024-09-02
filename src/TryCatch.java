import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        division(args);
    }

    public static void division(String[] args) {
        int firstNum, secondNum;
        int operation = 0;
        Scanner input = new Scanner(System.in);
        String separateLine = "----------------------------------";

        try {
            // Inputting data
            System.out.print("Enter the first number: ");
            firstNum = input.nextInt();

            System.out.print("Enter the second number: ");
            secondNum = input.nextInt();

            // Division Operation
            operation = firstNum / secondNum;

            // Printing results
            System.out.println(separateLine);
            System.out.println("Operation's result: " + operation);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            input.close(); // Ensure the Scanner is closed
        }
    }
}