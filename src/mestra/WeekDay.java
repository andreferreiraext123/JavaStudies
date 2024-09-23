package mestra;
import basic_concepts.Switch;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        //Storing data
        int dayWeek = 0;
        Scanner input = new Scanner(System.in);

        // Reading data
        System.out.print("Enter number for a day: ");
        dayWeek = input.nextInt();

        switch (dayWeek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Value!");
        }

        // Closing scanner
        input.close();
    }
}
