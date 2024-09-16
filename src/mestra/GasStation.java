package mestra;
import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        int gasQuantity, alcoholQuantity;
        double gasQuantityDiscount = 0, alcoholQuantityDiscount = 0;
        Scanner input = new Scanner(System.in);

        // Inputting data
        System.out.print("Enter the alcohol quantity: ");
        alcoholQuantity = input.nextInt();

        System.out.print("Enter the gasoline quantity: ");
        gasQuantity = input.nextInt();

        // Applying discounts on alcohol
        if (alcoholQuantity <= 20){
            alcoholQuantityDiscount = (alcoholQuantity * 0.97);
        } else if (gasQuantity > 20) {
            alcoholQuantityDiscount = (alcoholQuantity * 0.95);
        }
        // Applying discounts on gasoline
        if (gasQuantity <= 20){
            gasQuantityDiscount = (gasQuantity * 0.96);
        } else if (gasQuantity > 20) {
            gasQuantityDiscount = (gasQuantity * 0.94);
        }

        // Printing results
        System.out.println("The alcohol value: R$" + alcoholQuantityDiscount);
        System.out.println("The gasoline value: R$" + gasQuantityDiscount);


        // Closing scanner
        input.close();
    }
}

