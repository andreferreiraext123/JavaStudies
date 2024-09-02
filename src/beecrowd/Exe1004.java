package beecrowd;
import java.util.Scanner;

public class Exe1004 {
    public static void main(String[] args) {
        // Storing data
        int A,B,PROD;
        Scanner input = new Scanner(System.in);

        // Inputting data
        A = input.nextInt();
        B = input.nextInt();

        // Operation
        PROD = A * B;

        // Printing results
        System.out.println("PROD = " + PROD);

        // Closing scanner
        input.close();
    }
}
