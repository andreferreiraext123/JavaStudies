package beecrowd;
import java.util.Scanner;

public class Exe1005 {
    public static void main(String[] args) {
        // Storing data
        double A, B, MEDIA;
        Scanner input = new Scanner(System.in); // Init class scanner

        // Inputting data
        A = input.nextDouble();
        B = input.nextDouble();

        // Calculate weighted average
        MEDIA = (A * 3.5 + B * 7.5) / 11;

        // Printing results
        System.out.printf("MEDIA = %.5f%n", MEDIA);

        // Closing scanner
        input.close();
    }
}