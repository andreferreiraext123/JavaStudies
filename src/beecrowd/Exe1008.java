package beecrowd;
import java.util.Scanner;

/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

public class Exe1008 {
    public static void main(String[] args) {
        // Storing data
        int number, hoursWorked;
        float salary, hourlyPay;
        Scanner input = new Scanner(System.in);

        // Inputting data
        number = input.nextInt();
        hoursWorked = input.nextInt();
        hourlyPay = input.nextFloat();

        // Calculate
        salary = hourlyPay * hoursWorked;

        // Printing results
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        // Closing scanner
        input.close();
    }
}

