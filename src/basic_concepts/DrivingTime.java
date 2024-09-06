package basic_concepts;

import java.util.Scanner;

public class DrivingTime {
    public static void main(String[] args){
        // The program needs to inform how long the journey will take, and the amount spent on fuel.
            // Needs return: hours spend,
        // Storing data
        float averageSpeedKH, fuelPricePerLiter, hours, cost;
        int distanceKM;
        String underline = "------------------";

        // Init scanner method
        Scanner input = new Scanner(System.in);

        // Inputting the distance variable
        System.out.print("Enter the distance in kilometers:  ");
        distanceKM = input.nextInt();

        // Inputting the variable fuel
        System.out.print("Enter the fuel's price per liter:  ");
        fuelPricePerLiter = input.nextFloat();

        // Inputting the average speed
        System.out.print("Enter the average speed per KH:  ");
        averageSpeedKH = input.nextFloat();

        // Calculations
        hours = averageSpeedKH / distanceKM;
        cost = distanceKM * fuelPricePerLiter;

        // Printing the results
        System.out.println(underline);
        System.out.println("Hours spend:  " + hours);
        System.out.println("Money spend: $" + cost);
        System.out.println("Average speed:  " + averageSpeedKH);
        System.out.println("Distance in KM:  " + distanceKM);
        System.out.println("Fuel price per liter:  " + fuelPricePerLiter);
        System.out.println(underline);

    }
}
