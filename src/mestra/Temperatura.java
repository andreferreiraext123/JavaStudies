package mestra;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        int temperatura;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua temperatura: ");
        temperatura = input.nextInt();

        if (temperatura > 38){
            System.out.println("Voce está febrio");
        } else {
            System.out.println("Voce nao está com febre!");
        }

    }
}


