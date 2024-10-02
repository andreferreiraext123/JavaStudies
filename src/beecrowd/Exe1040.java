package beecrowd;
import java.util.Scanner;

public class Exe1040 {
    public static void main(String[] args) {
        gradeStudent();
    }

    public static void gradeStudent() {
        Scanner input = new Scanner(System.in);

        // Reading data
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        // Calculating weighted average
        double avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;

        // Truncating the average to one decimal place without rounding
        avg = Math.floor(avg * 10) / 10;

        // Displaying average
        System.out.printf("Media: %.1f\n", avg);

        // Checking the average grade
        if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (avg < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            // Reading exam grade
            double examGrade = input.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", examGrade);

            // Updating average with exam grade
            avg = (avg + examGrade) / 2.0;

            // Truncating the final average
            avg = Math.floor(avg * 10) / 10;

            // Checking final result
            if (avg >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            // Displaying final average
            System.out.printf("Media final: %.1f\n", avg);
        }

        // Closing scanner
        input.close();
    }
}
