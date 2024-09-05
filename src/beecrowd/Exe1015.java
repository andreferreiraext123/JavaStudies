package beecrowd;
import java.util.Scanner;

public class Exe1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Calculate
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Printing results
        System.out.printf("%.4f%n", distancia);

        input.close();
    }
}
