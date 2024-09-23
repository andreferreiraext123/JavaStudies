package mestra;
import java.util.Scanner;

public class InvestigatingSuspect {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int ask1, ask2, ask3, ask4, ask5, amountYes;



        // Reading data
        System.out.println("Just answer 1 for Yes or 0 for No!");
        System.out.print("called the victim? ");
        ask1 = input.nextInt();
        System.out.print("Were you at the crime scene? ");
        ask2 = input.nextInt();
        System.out.print("Lives near victim? ");
        ask3 = input.nextInt();
        System.out.print("Did you owe the victim? ");
        ask4 = input.nextInt();
        System.out.print("Have you worked with the victim? ");
        ask5 = input.nextInt();

        amountYes = ask1 + ask2 + ask3 + ask4 + ask5;

        if (amountYes == 2){
            System.out.println("Suspect");
        } else if (amountYes >= 3 && amountYes <= 4){
            System.out.println("Accomplice");
        } else if (amountYes == 5){
            System.out.println("Assassin");
        } else{
            System.out.println("Innocent");
        }

        // Closing scanner
        input.close();
    }
}
