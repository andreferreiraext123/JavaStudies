package mestra;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Coloque sua idade: ");
        age = input.nextInt();


        if (age >= 18){
            System.out.println("Voce pode ter a CNH");
        } else{
            System.out.println("Voce nao pode ter CNH");
        }


    }
}
