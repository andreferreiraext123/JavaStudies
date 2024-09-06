package beecrowd;
import java.util.Scanner;

public class Exe1020 {
    public static void main(String[] args) {
        // Storing data
        int dayQuantity, year, month, day, remainingDays;
        Scanner input = new Scanner(System.in);

        // Inputting data
        dayQuantity = input.nextInt();

        // Conversion
        year = dayQuantity / 365;
        remainingDays = dayQuantity % 365;
        month = remainingDays / 30;
        day = remainingDays % 30;

        // Printing results
        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");

        // Closing scanner
        input.close();
    }
}
