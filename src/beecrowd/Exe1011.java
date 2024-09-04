package beecrowd;
import java.util.Scanner;

public class Exe1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading ray
        double ray = scanner.nextDouble();

        // Assigning pi value
        double pi = 3.14159;

        // Volume's calculate
        double volume = (4.0 / 3.0) * pi * Math.pow(ray, 3);

        // Printing with three decimal cases
        System.out.printf("VOLUME = %.3f\n", volume);



    }
}
