import java.util.Scanner;

public class Exe1014 {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int X;
        double Y, averageFuelConsumption;

        // Input data
        X = input.nextInt();
        Y = input.nextDouble(); // Use nextDouble() to read the floating-point number

        // Calculate
        averageFuelConsumption = X / Y; // Calculate average fuel consumption

        // Print results
        System.out.printf("%.3f km/l%n", averageFuelConsumption);

        // Closing Scanner
        input.close();
    }
}
