import java.util.Scanner; //Importa a classe Scanner do pacote java.util para poder usá-la

public class ReadInput {
    public static void main(String[] args){
        // Cria um objeto Scanner chamado "input", que será usado para ler dados do console.
        // O "System.in" representa o fluxo de entrada padrão (teclado), que será usado pelo Scanner.
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name:  "); // Print a text
        String fullName = input.nextLine(); // Store the inputted value on variable called 'name', from data type String
        System.out.println("Your name is:   " + fullName); // Print the value stored in variable 'name'

        System.out.print("How old are you?: ");
        byte age = input.nextByte();
        System.out.println("You're " + age + " years old");

        System.out.print("Enter your first name:    ");
        String firstName = input.next();
        System.out.println("Your first name is: " + firstName);

        System.out.print("Enter your height:    ");
        double height = input.nextDouble();
        System.out.println("You are " + height + " meters tall");
    }

}
