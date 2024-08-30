import java.util.Scanner;

public class AreaValue {
    public static void main(String[] args){

        // Storing data
        float frontMeters, sideMeters, areaTotalMeters;
        float valuePerSquareMeter;

        //Scanner keyboaard;

        Scanner keyboaard = new Scanner(System.in);

        System.out.println("How many metters the land be in front? ");
        frontMeters = keyboaard.nextFloat();
        System.out.println("How many metters the land be on side? ");
        sideMeters = keyboaard.nextFloat();
        System.out.println("Enter the value from meter square");
        valuePerSquareMeter = keyboaard.nextFloat();

        System.out.print("A area total do " + frontMeters + " meters from front with " + sideMeters + "meters from side ");
        areaTotalMeters = frontMeters * sideMeters;

        System.out.println(areaTotalMeters + " meters");

        System.out.println("Value of land: " + (areaTotalMeters * valuePerSquareMeter));
    }
}
