package mestra;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        // Storing data
        double produto;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do produto:  ");
        produto = input.nextDouble();

        if (produto > 100){
            produto = (produto * 0.9);
            System.out.print("Valor do produto com desconto aplicado: " + produto);
        } else {
            System.out.println("Valor do produto sem desconto: " + produto);
        }

    }
}
