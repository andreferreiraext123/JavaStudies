package mestra;
import java.util.Scanner;

public class AreaValue {
    public static void main(String[] args){

        // Storing data
        float frontMeters, sideMeters, areaTotalMeters, valuePerSquareMeter, valueOfLandArea;
        String underline = "-----------------------------";

        //Init scanner method;
        Scanner keyboaard = new Scanner(System.in);

        System.out.println("How many metters the land be of front? ");
        frontMeters = keyboaard.nextFloat();
        System.out.println("How many metters the land be on side? ");
        sideMeters = keyboaard.nextFloat();
        System.out.println("Enter the value from meter square");
        valuePerSquareMeter = keyboaard.nextFloat();

        areaTotalMeters = frontMeters * sideMeters; // Total meters
        valueOfLandArea =   valuePerSquareMeter * areaTotalMeters; // total value area

        // Printing results
        System.out.println(underline);
        System.out.println("Meters front: " + frontMeters);
        System.out.println("Meters side:  " + sideMeters);
        System.out.println("Price per meter square: " + valuePerSquareMeter);

        System.out.println("Land area:  " + areaTotalMeters);
        System.out.println("Value of land area:  " + valueOfLandArea);


    }
}
