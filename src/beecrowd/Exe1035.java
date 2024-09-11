package beecrowd;
import java.util.Scanner;

public class Exe1035 {
    public static void main(String[] args) {
        int A, B, C, D;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        if ((B > C) && (D > A) && ((C + D) > (A + B)) && (C > 0 && D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        input.close();
    }
}
