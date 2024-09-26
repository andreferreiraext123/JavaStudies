package mestra;
import java.util.Scanner;
/*
O programa deverá perguntar ao usuário o valor do saque e depois informar quantas
notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de
notas existentes na máquina.
 */

public class Troco {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int withdraw;
        int[] notes = {100, 50, 10, 5, 1};  // Notas disponíveis
        int[] noteWithdraw = {0, 0, 0, 0, 0};  // Quantidade de cada nota

        // Reading data
        System.out.print("Digite o valor do saque (mínimo R$10, máximo R$600): ");
        withdraw = input.nextInt();

        // Checking withdraw
        if (withdraw < 10 || withdraw > 600) {
            System.out.println("Valor inválido. O valor deve estar entre R$10 e R$600.");
        } else {
            // Distribuição das notas
            for (int i = 0; i < notes.length; i++) {
                noteWithdraw[i] = withdraw / notes[i];  // Calcula a quantidade de cada nota
                withdraw = withdraw % notes[i];  // Atualiza o valor restante
            }

            // Showing results
            System.out.println("Notas fornecidas:");
            for (int i = 0; i < notes.length; i++) {
                if (noteWithdraw[i] > 0) {
                    System.out.println(noteWithdraw[i] + " nota(s) de R$" + notes[i]);
                }
            }
        }

        // Closing scanner
        input.close();
    }
}
