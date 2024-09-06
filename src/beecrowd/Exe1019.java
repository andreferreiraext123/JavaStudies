package beecrowd;
import java.util.Scanner;

public class Exe1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // Calculate
        int horas = N / 3600;
        int minutes = (N % 3600) / 60;
        int seconds = N % 60;

        // Printing results
        System.out.println(horas + ":" + minutes + ":" + seconds);

        // Closing scanner
        input.close();
    }
}
