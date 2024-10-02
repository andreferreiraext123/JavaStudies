package beecrowd;
import java.util.Scanner;
public class Exe1038 {
    public static void main(String[] args) {
        snackPrice();
    }

    public static void snackPrice(){
        Scanner input = new Scanner(System.in);
        double total = 0;
        int code = input.nextInt();
        int quantity = input.nextInt();

        if (code == 1){
            total = quantity * 4;
        } else if (code == 2) {
            total = quantity * 4.5;
        } else if (code == 3) {
            total = quantity * 5;
        } else if (code == 4) {
            total = quantity * 2;
        } else if (code == 5) {
            total = quantity * 1.5;
        }

       System.out.printf("Total: R$ %.2f\n", total);
    }
}
