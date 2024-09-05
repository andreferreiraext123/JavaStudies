package beecrowd;
import java.util.Scanner;

public class Exe1017 {
    public static void main(String[] args) {
        // Storing data
        int journeyH, averageSpeedKMH, distancePerLiter = 12;
        double totalLitersCost;
        Scanner input = new Scanner(System.in);

        // Inputting data
        journeyH = input.nextInt();
        averageSpeedKMH = input.nextInt();

        // Calculate
        totalLitersCost = (double) (journeyH * averageSpeedKMH) / distancePerLiter;

        // Printing results
        System.out.printf("%.3f\n", totalLitersCost);

        // Closing scanner
        input.close();
    }
}
