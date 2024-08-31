package mestra;
/*
The Gostosura snack bar sells only one type of sandwich, whose filling includes two slices of cheese,
one slice of ham and one slice of hamburger.
Knowing that each slice of cheese or ham weighs 50 grams, and that a slice of hamburger weighs 120 grams,
create an algorithm so that the owner provides the quantity of sandwiches to make, and the machine informs the
quantities (in kilos) of cheese, ham and meat needed for purchase.
 */
import java.util.Scanner;

public class Sandwiches {
    public static void main(String[] args){
        // Storing data
        int quantityHamburgs;
        float steakHumburger = 120, sliceOfCheese = 100, sliceOfHam = 50;
        Scanner input = new Scanner(System.in);
        String separateLine = "--------------------------------------";

        // Inputting information
        System.out.print("Enter the quantity of burger:  ");
        quantityHamburgs = input.nextInt();


        // Calculates
        steakHumburger = (steakHumburger * quantityHamburgs) / 1000;
        sliceOfCheese = (sliceOfCheese * quantityHamburgs) / 1000;
        sliceOfHam = (sliceOfHam * quantityHamburgs) / 1000;

        // Printing results
        System.out.println(separateLine);
        System.out.println("To produce " + quantityHamburgs + " hamburgs. You need:");
        System.out.println(sliceOfCheese + " KGs of cheese");
        System.out.println(sliceOfHam + " KGs of ham");
        System.out.println(steakHumburger + " KGs of hamburger");
        System.out.println(separateLine);

        // Closing scanner
        input.close();

    }
}
