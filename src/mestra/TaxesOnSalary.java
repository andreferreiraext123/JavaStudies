package mestra;
import java.util.Scanner;

public class TaxesOnSalary {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int quantityHoursWorked = 0, hourValue = 0;
        double baseSalary, IR, INSS, FGTS, salaryAfterTaxes;

        // Reading data
        System.out.print("Enter your salary: ");
        baseSalary = input.nextDouble();

        baseSalary = quantityHoursWorked * hourValue;

        // Applying discounts from IR's taxes for base salary
        if (baseSalary <= 900){
            IR = baseSalary;
        } else if (baseSalary > 900 && baseSalary <= 1500) {
            IR = baseSalary * 0.95;
        } else if (baseSalary > 1500 && baseSalary <= 2500) {
            IR = baseSalary * 0.9;
        } else if (baseSalary > 2500) {
            IR = baseSalary * 0.8;
        }

        // Closing scanner
        input.close();
    }
}
