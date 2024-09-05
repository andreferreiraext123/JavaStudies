package beecrowd;
import java.util.Scanner;

public class Exe1018 {
    public static void main(String[] args) {
        // Definindo as notas disponíveis
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int[] quantityNotes = new int[7]; // Array para armazenar a quantidade de cada nota

        Scanner input = new Scanner(System.in);

        // Recebendo o valor do dinheiro
        int money = input.nextInt();
        int originalMoney = money; // Guardar o valor original para impressão posterior

        // Processando a quantidade de cada nota
        for (int i = 0; i < notes.length; i++) {
            quantityNotes[i] = money / notes[i]; // Calcula a quantidade de notas de cada tipo
            money %= notes[i]; // Atualiza o valor de money com o restante
        }

        System.out.println(originalMoney);
        for (int i = 0; i < notes.length; i++) {
            System.out.println(quantityNotes[i] + " nota(s) de R$ " + notes[i] + ",00");
        }

        input.close();
    }
}
