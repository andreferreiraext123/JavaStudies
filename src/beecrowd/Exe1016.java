package beecrowd;
import java.util.Scanner;


public class Exe1016 {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int distance, time;

        // Input data
        distance = input.nextInt();
        time = distance * 2;

        // Printing results
        System.out.println(time + " minutos");

        // Closing scanner
        input.close();
    }
}
