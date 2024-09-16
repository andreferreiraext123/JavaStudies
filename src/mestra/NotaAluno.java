package mestra;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        int scoreOne, scoreTwo, average;
        Scanner input = new Scanner(System.in);

        // Reading data
        System.out.print("Enter the first score: ");
        scoreOne = input.nextInt();

        System.out.print("Enter the second score: ");
        scoreTwo = input.nextInt();

        // Average calculate
        average = (scoreOne + scoreTwo) / 2;

        // Checking
        if (average >= 7) {
            if (average == 10){
                System.out.println("You are aproved with glamour");
        } else{
                System.out.println("You are approved");
            }
        } else{
            System.out.println("You are failed");
        }
    }
}
