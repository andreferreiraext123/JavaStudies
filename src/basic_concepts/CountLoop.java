package basic_concepts;
import java.util.Scanner;
public class CountLoop {
    public static void main(String[] args) {
        countingBy100();
        System.out.println();
        countingEvenNumbers();
        System.out.println();
        multiplicationTable();
    }

    // Create a program that counts to 100 by tens:
    public static void countingBy100() {
        for (int n = 0; n <= 100; n += 10) {
            System.out.println(n);
        }
    }

    // In this example, we create a program that only print even values between 0 and 10:
    public static void countingEvenNumbers() {
        for (int n = 0; n <= 10; n += 2) {
            System.out.println(n);
        }
    }

    // create a program that prints the multiplication table for a specified number:
    public static void multiplicationTable() {
        int table = 0;
        boolean stop = true;
        String answer;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        table = input.nextInt();
        input.nextLine();  // Consumir o caractere de nova linha (\n)

        while (stop) {
            for (int num = 0; num <= 10; num++) {
                System.out.println("Multiplication table: " + table + " * " + num + " = " + (table * num));
            }

            System.out.println("Do you want to continue? ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Yes")) {  // Comparar conteúdo da string
                continue;
            } else {
                stop = false;
            }
        }
    }
}
