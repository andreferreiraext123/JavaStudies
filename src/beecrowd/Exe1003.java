package beecrowd;
import java.util.Scanner;

public class Exe1003 {
    public static void main(String[] args) {
        int A,B,SOMA;
        Scanner input = new Scanner(System.in); // Init method scanner

        // Inputting data
        A = input.nextInt();
        B = input.nextInt();

        // Calculate
        SOMA = A + B;

        // Printing
        System.out.println("SOMA = " + SOMA);


        // Closing scanner
        input.close();
    }
}
