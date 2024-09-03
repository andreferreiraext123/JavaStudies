package beecrowd;
import java.util.Scanner;

public class Exe1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Storing data
        int A,B,C,D,DIFERENCA;

        // Inputting data
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        // Calculate
        DIFERENCA = ((A * B) - (C * D));

        // Printing results
        System.out.println("DIFERENCA = " + DIFERENCA);

        //Closing scanner
        input.close();

    }
}
