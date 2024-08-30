package mestra;
/*
Create an algorithm that receives the value of the minimum wage and the value of an employee's salary,
calculates and displays the amount of minimum wage that this employee earns.
 */
import java.util.Scanner;

public class AmountOfWages {
    public static void main(String[] args) {
        // Storing data
        double minimumWage, employeeSalary, quantityOfMinimumSalaries;
        String separatorLine = "------------------------------";
        Scanner input = new Scanner(System.in);

        // Inputting information
        System.out.print("Enter the minimum wage: ");
        minimumWage = input.nextDouble();
        System.out.print("Enter your salary: ");
        employeeSalary = input.nextDouble();

        // Calculating the number of minimum wages
        quantityOfMinimumSalaries = employeeSalary / minimumWage;

        // Printing results
        System.out.println(separatorLine);
        System.out.printf("Your salary is: %.2f%n", employeeSalary);
        System.out.printf("The minimum wage is: %.2f%n", minimumWage);
        System.out.printf("You receive: %.2f %s%n", quantityOfMinimumSalaries, "minimum wages");
        System.out.println(separatorLine);

        // Closing the Scanner
        input.close();
    }
}
