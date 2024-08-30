package mestra;

/*
Create an algorithm to read an employee's salary and increase it by 15%.
After the increase, deduct 11% of INSS and 8% of FGTS.
Print the initial salary, the salary with the increase,
the final salary, the INSS discount, the FGTS discount and the Total Discounts (INSS+FGTS).
 */

import java.util.Scanner;

public class TaxesSalary {
    public static void main(String[] args){
        // Storing data
        float salary,salaryIcrease, inssApplied,fgtsApplied, salaryNow, totalDiscounts;
        int increase = 15, inss = 11, fgts = 8;
        Scanner input = new Scanner(System.in);
        String separateLine = "---------------------------";

        // Inputting information
        System.out.print("Enter the salary:  ");
        salary = input.nextFloat();

        // Calculations
        salaryIcrease = ((salary * increase) / 100) + salary; // Applying the increase
        inssApplied = ((salaryIcrease * inss) / 100); // Applying inss discount
        fgtsApplied = ((salaryIcrease * fgts) / 100); // Applyind fgts discount
        totalDiscounts = inssApplied + fgtsApplied; // Applyind all discounts
        salaryNow = salaryIcrease - totalDiscounts; // showing current salary

        // Printing results
        System.out.println(separateLine);
        System.out.println("Your base salary:  " + salary);
        System.out.println("Salary increase:  " + salaryIcrease);
        System.out.println("Discount inss:  " + inssApplied);
        System.out.println("Discount fgts:  " + fgtsApplied);
        System.out.println("Total discounts:  " + totalDiscounts);
        System.out.println("Salary now:  " + salaryNow);
        System.out.println(separateLine);

        // Closing the scanner
        input.close();
    }
}
