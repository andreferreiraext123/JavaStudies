package beecrowd;
import java.util.Scanner;

public class Exe1009 {
    public static void main(String[] args) {
        // Storing data
        String nome;
        double fixedSalary, salesValue, salaryNow;
        Scanner input = new Scanner(System.in);

        //Inputting data
        nome = input.next();
        fixedSalary = input.nextDouble();
        salesValue = input.nextDouble();

        // Calculate
        salaryNow = ((salesValue * 15) /100) + fixedSalary;

        // Printing results
        System.out.printf("TOTAL = R$ %.2f%n", salaryNow);

        // Closing scanner
        input.close();
    }
}
