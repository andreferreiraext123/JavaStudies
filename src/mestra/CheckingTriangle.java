package mestra;
import java.util.Scanner;

public class CheckingTriangle {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner (System.in);
        int a,b,c;

        // Reading data
        System.out.print("Enter the first side: ");
        a = input.nextInt();
        System.out.print("Enter the second side: ");
        b = input.nextInt();
        System.out.print("Enter the third side: ");
        c = input.nextInt();

        // Checking which triangles it's
        if (a == b && b == c && c == a){
            System.out.println("Equilateral Triangle");
        } else if ((a == b) || (a == c) || (b == c)){
            System.out.println("Isosceles Triangle");
        } else if (a != b && a != c && b != c){
            System.out.println("Scalene triangle");
        }
        // Closing scanner
        input.close();
    }
}
