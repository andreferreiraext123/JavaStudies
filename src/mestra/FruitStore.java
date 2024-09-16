package mestra;
import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        double appleKG, strawberryKG, applePriceNow = 0, strawberryPriceNow = 0;

        // Reading data
        System.out.print("Enter strawberry kilograms: ");
        strawberryKG = input.nextDouble();

        System.out.print("Enter apple kilograms: ");
        appleKG = input.nextDouble();

        // Applying prices
        if (appleKG <= 5 && strawberryKG <= 5){
            strawberryPriceNow = strawberryKG * 2.5 ;
            applePriceNow = appleKG * 1.8;
        } else if (appleKG > 5 && strawberryKG > 5) {
            strawberryPriceNow = strawberryKG * 2.2;
            applePriceNow = appleKG * 1.5;
        }
        if (((appleKG + strawberryKG) > 8) || ((strawberryPriceNow) + (applePriceNow)) > 25){
            strawberryPriceNow = strawberryPriceNow * 0.9;
            applePriceNow = applePriceNow * 0.9;
        }

        // Printing results
        System.out.println("Strawberry price: R$" + strawberryPriceNow + " Strawberry quantity: KG" + strawberryKG);
        System.out.println("Apple price: R$" + applePriceNow + " Apple quantity: KG" + appleKG);


        // Closing scanner
        input.close();
    }
}
