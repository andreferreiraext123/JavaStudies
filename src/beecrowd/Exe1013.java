package beecrowd;
import java.util.Scanner;


public class Exe1013 {
    public static void main(String[] args) {
        // Storing data
        int num1,num2,num3;
        int biggest;
        Scanner input = new Scanner(System.in);

        // Inputting data
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // Checking the biggest
        if (num1 >= num2 && num1 >= num3) {
            biggest = num1;
        } else if (num2 >= num1 && num2 >= num3){
            biggest = num2;
        } else {
            biggest = num3;
        }

        // Printing results
        System.out.println(biggest + " eh o maior");

        // Closing scanner
        input.close();

    }
}
