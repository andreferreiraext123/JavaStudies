/*
Diferença entre os comandos next e nextLine:
    O comando next lê a próxima palavra do input, parando quando encontra um espaço em branco.
    O comando nextLine lê toda a linha até encontrar uma quebra de linha (\n).
    Ambos os métodos leem strings, mas next é limitado a uma palavra, enquanto nextLine lê a linha inteira.

 */
import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Init method scanner
        String firstName, fullName;

        // Inputting data
        System.out.print("Enter your first name: ");
        firstName = input.next(); // Just reads the first word

        input.nextLine(); // Cleaning buffer

        System.out.print("Enter your full name: ");
        fullName = input.nextLine(); //The nextLine command reads the entire line until it encounters a newline (\n).

        // Printing results
        System.out.println("Your first name is: " + firstName);
        System.out.println("Your full name is: " + fullName);

        // Closing scanner
        input.close();
    }
}