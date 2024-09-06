package basic_concepts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CostCalculate {
    public static void main(String[] args){
        // Storing the data
        int item = 50;
        float costPerItem = 9.99f;
        float totalCost = costPerItem * item;
        char currency = '$';

        // Limiting the total cost to two decimal places
        BigDecimal bd = new BigDecimal(totalCost).setScale(2, RoundingMode.HALF_UP);
        totalCost = bd.floatValue();

        // Printing prices
        System.out.println("Total items: " + item);
        System.out.println("Cost per item: " + currency + costPerItem);
        System.out.println("Total cost: " + currency + totalCost);
    }
}