package beecrowd;
import java.util.Scanner;

public class Exe1036 {
    public static void main(String[] args) {
        bhaskara();
    }
    public static void bhaskara(){
        // Storing data
        double A,B,C;
        Scanner input = new Scanner(System.in);

        // Entrada de 3 valores A, B, C
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // Cálculo do delta (B² - 4AC)
        double delta = B * B - 4 * A * C;

        // Verificando se é possível calcular as raízes
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Cálculo das raízes usando a fórmula de Bhaskara
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Saída com 5 casas decimais
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        input.close();
    }
}