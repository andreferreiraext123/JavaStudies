package beecrowd;
import java.util.Scanner;

public class Exe1002 {
    public static void main(String[] args) {
        final double PI = 3.14159;  // Constante PI
        double area, raio;

        // Criação do scanner para leitura da entrada
        Scanner input = new Scanner(System.in);

        // Leitura do valor de raio
        raio = input.nextDouble();

        // Cálculo da área
        area = PI * raio * raio;

        // Exibição do resultado formatado com 4 casas decimais
        System.out.printf("A=%.4f%n", area);

        // Fechamento do scanner
        input.close();
    }
}