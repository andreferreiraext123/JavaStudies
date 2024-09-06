package basic_concepts;

import java.util.Scanner;

public class FigurasGeometricas {
    public static void main(String[] args){
        // Armazenando variaveis
        double a,b,c;
        double pi = 3.14159, raioCirculo, areaTrapezio, areaQuadrado, areaRetangulo, areaTriangulo;

        // iniciando o metodo scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base");
        a = teclado.nextDouble();

        System.out.println("Digite a altura");
        b = teclado.nextDouble();

        System.out.println("Digite a largura");
        c = teclado.nextDouble();

        // Calculando a area do triangulo
        areaTriangulo = (a * c) / 2;

        // Calculando area do raio do circulo
        raioCirculo = pi * (c* c);

        // Calculando a area do trapézio
        areaTrapezio = ((a + b) * c)/2;

        // Calculando a area do quadrado
        areaQuadrado = b * b;

        // Calculando area do retangulo
        areaRetangulo = a * b;

        System.out.printf("Triangulo: %.3f%n" , areaTriangulo);
        System.out.printf("Circulo: %.3f%n" , raioCirculo);
        System.out.printf("Trapézio: %.3f%n" , areaTrapezio);
        System.out.printf("Quadrado: %.3f%n" , areaQuadrado);
        System.out.printf("Retangulo: %.3f%n" , areaRetangulo);

    }
}
