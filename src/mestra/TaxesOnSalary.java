package mestra;
import java.util.Scanner;

public class TaxesOnSalary {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int quantityHoursWorked;
        double grossSalary, IR = 0, INSS, FGTS, netSalary, totalDiscounts, hourValue;

        // Reading data
        System.out.print("Enter hours worked: ");
        quantityHoursWorked = input.nextInt();
        System.out.print("Enter hours value: ");
        hourValue = input.nextDouble();

        // Applying the base salary calculation
        grossSalary = quantityHoursWorked * hourValue;

        // Calculate IR based on salary ranges
        if (grossSalary <= 900) {
            IR = 0;  // No IR applied
        } else if (grossSalary > 900 && grossSalary <= 1500) {
            IR = 0.05;  // 5% IR
        } else if (grossSalary > 1500 && grossSalary <= 2500) {
            IR = 0.1;  // 10% IR
        } else if (grossSalary > 2500) {
            IR = 0.2;  // 20% IR
        }

        // Applying discounts correctly
        double IRValue = grossSalary * IR;  // Calculate the IR discount
        INSS = grossSalary * 0.1;  // 10% INSS discount
        FGTS = grossSalary * 0.08;  // 8% FGTS (not applied as a discount)

        // Total discounts applied to the net salary (IR and INSS only)
        totalDiscounts = IRValue + INSS;
        netSalary = grossSalary - totalDiscounts;  // Net salary after applying IR and INSS discounts

        // Displaying results
        System.out.println("Hours worked: " + quantityHoursWorked);
        System.out.println("Hour value: " + hourValue);
        System.out.println("Base salary: " + quantityHoursWorked + " * " + hourValue + ": " + grossSalary);
        System.out.println("(-) IR: " + IRValue);
        System.out.println("(-) INSS: " + INSS);
        System.out.println("FGTS: " + FGTS);  // Show FGTS but do not apply as a discount
        System.out.println("Total discounts: " + totalDiscounts);
        System.out.println("Net salary: " + netSalary);

        // Closing scanner
        input.close();
    }
}
