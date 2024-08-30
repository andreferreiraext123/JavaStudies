package mestra;
/*
The Frangotech farm has automated control over each chicken in its production.
On the chicken's right foot there is a ring with an identification chip;
on the left foot there are two rings to indicate the type of food it should consume.
Knowing that the ring with the chip costs R$4.00 and the food ring costs R$3.50,
create an algorithm to calculate the farm's total cost of tagging all its chickens,
which must be reported by the user.
*/

import java.util.Scanner;

public class Chicken {
    public static void main(String[] args){
        // Storing data
        int chickenCost = 11, chickenQuantity;
        float totalCost;
        String separateLine = "-------------------------------------------------";
        Scanner input = new Scanner(System.in); // Init method scanner

        System.out.print("Enter the chicken quantity:  ");
        chickenQuantity = input.nextInt(); // Storing the number of chicken

        // Calculating the total cost for all chickens
        totalCost = chickenCost * chickenQuantity;

        // Printing results
        System.out.println(separateLine);
        System.out.printf("The values to identify all chickens are:  R$%.2f%n" , totalCost);
        System.out.println(separateLine);

        // Closing scanner
        input.close();
    }
}
