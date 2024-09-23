package mestra;
import java.util.Scanner;

public class StudentScoreAverage {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner (System.in);
        float firstGrade, secondGrade, avg = 0;

        // Reading data
        System.out.print("Enter your first score: ");
        firstGrade = input.nextFloat();
        System.out.print("Enter your second score: ");
        secondGrade = input.nextFloat();

        // Applying average calculate
        avg = (firstGrade + secondGrade) / 2;

        // Checking the letter grades
        if (avg >= 9){
            System.out.println("A");
        } else if (avg >= 7.5 && avg < 9){
            System.out.println("B");
        } else if (avg >= 6 && avg < 7.5){
            System.out.println("C");
        } else if (avg >= 4 && avg < 6){
            System.out.println("D");
        } else if (avg >= 0 && avg < 4){
            System.out.println("E");
        }
        // Closing scanner
        input.close();
    }
}
