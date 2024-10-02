package beecrowd;
import java.util.Scanner;

public class Exe1037 {
    public static void main(String[] args) {
        isInRange();
    }

    public static void isInRange() {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor de ponto flutuante da entrada
        double num = scanner.nextDouble();

        // Verifica em qual intervalo o valor se encontra e imprime a mensagem correspondente
        if (num >= 0.0 && num <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (num > 25.0 && num <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (num > 50.0 && num <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else if (num > 75.0 && num <= 100.0) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        scanner.close();
    }
}
