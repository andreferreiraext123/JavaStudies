package beecrowd;
import java.util.Scanner;

public class Exe1012 {
    public static void main(String[] args) {
        // Storing data
        double A,B,C,areaTriangle, areaSquare, rayCircle, areaRectangle, areaTrapezoid;
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);

        // Inputting data
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        // Calculate
        areaTriangle = (A * C) / 2;
        areaSquare = B * B;
        rayCircle = pi * (C * C);
        areaRectangle = A * B;
        areaTrapezoid = ((A + B) * C)/2;

        // Printing results
        System.out.printf("TRIANGULO: %.3f%n", areaTriangle);
        System.out.printf("CIRCULO: %.3f%n", rayCircle);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezoid);
        System.out.printf("QUADRADO: %.3f%n", areaSquare);
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);

        // Closing scanner
        input.close();
    }
}
