package mestra;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int num;

        // Reading data
        System.out.print("Enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0 && num > 0){
            System.out.println("Number is even and positive!");
        } else if (num % 2 == 0 && num < 0){
            System.out.println("Number is even and negative");
        } else if (num % 2 != 0 && num > 0){
            System.out.println("Number is odd and positive!");
        } else if (num % 2 != 0 && num < 0){
            System.out.println("Number is odd and negative!");
        } else{
            System.out.print("Number is neutral!");
        }
        // Closing scanner
        input.close();
    }
}
