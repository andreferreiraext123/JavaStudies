package mestra;

/*
Create an algorithm to calculate how many horseshoes are needed to equip all the horses purchased for a stud farm.
The user must enter the number of horses purchased.
*/

import java.util.Scanner;

public class HorsershoesQuantity {
    public static void main(String[] args){
        // Storing data
        int horseShoesQuantity, horsesNumber;
        float horseShoesPricePerOne, horseShoesPrice;
        String separatorLine = "---------------------------------";
        Scanner input = new Scanner(System.in);

        // Inputting information
        System.out.print("Enter the horse's number:  ");
        horsesNumber = input.nextInt();

        System.out.print("Enter the price per horseshoes:  ");
        horseShoesPricePerOne = input.nextFloat();

        // Calculates
        horseShoesQuantity = (horsesNumber * 4);
        horseShoesPrice = horseShoesQuantity * horseShoesPricePerOne;

        // Printing results
        System.out.println(separatorLine);
        System.out.println("Number of horseshoes needed:  " + horseShoesQuantity);
        System.out.printf("Total value of horseshoes:  %.2f%n" , horseShoesPrice);
        System.out.println(separatorLine);

        // Closing the Scanner
        input.close();
    }
}
