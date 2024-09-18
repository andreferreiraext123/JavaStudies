package mestra;
import java.util.Scanner;

public class SalaryAdjustment {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        double salary, salaryAdjustment = 0, percentIncrease;

        //Reading data
        System.out.print("Enter your current salary: ");
        salary = input.nextDouble();

        // Applying adjustments
        if (salary < 281) {
            salaryAdjustment = salary * 1.2;
        } else if (salary > 281 && salary <= 700) {
            salaryAdjustment = salary * 1.15;
        } else if (salary > 700 && salary <= 1500) {
            salaryAdjustment = salary * 1.1;
        } else if (salary > 1500) {
            salaryAdjustment = salary * 1.05;
        }

        // Calculating the percent increase
        percentIncrease = ((salaryAdjustment - salary) / salary) * 100;

        // Printing results
        System.out.printf("Your salary before the adjustment:  R$%.2f\n", salary);
        System.out.printf("The percent of the increase:  R$%.2f\n", percentIncrease);
        System.out.printf("The value of the increase:  R$%.2f\n", (salaryAdjustment - salary));
        System.out.printf("Your salary now after the adjustment:  R$%.2f\n", salaryAdjustment);

        // Closing input
        input.close();
    }
}
