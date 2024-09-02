package beecrowd;
import java.util.Scanner;

public class Exe1001 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int A, B, X;

        A = scan.nextInt();
        B = scan.nextInt();
        X = A+B;

        System.out.println("X = " + X);
        scan.close();
    }

}