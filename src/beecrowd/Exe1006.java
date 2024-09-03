package beecrowd;

import java.util.Scanner;

public class Exe1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ler as três notas
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        // Calcular a média ponderada
        double MEDIA = (A * 2 + B * 3 + C * 5) / 10;

        // Imprimir o resultado conforme o formato especificado
        System.out.printf("MEDIA = %.1f%n", MEDIA);

        // Fechar o scanner
        input.close();
    }
}
