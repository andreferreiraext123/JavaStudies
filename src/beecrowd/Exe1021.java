package beecrowd;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1021 {
    public static void main(String[] args) {
        // Storing data
        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        Scanner input = new Scanner(System.in);
        boolean  condition = true;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        double money = input.nextDouble();


        System.out.println("NOTAS: ");
        for (int i = 0; i < notes.length; i++){
            //System.out.println(notes[i]);
            System.out.println( ((int) money / notes[i])+ " nota(s) de R$ " + decimalFormat.format(notes[i]));
            money = Double.parseDouble(decimalFormat.format(money % notes[i]));
        }
        System.out.println("MOEDAS: ");
        for (int i = 0; i < coins.length; i++){
            double coinMoney = (money / coins[i]);
            System.out.println((int) coinMoney +  " moeda(s) de R$ " + decimalFormat.format(coins[i]));
            money = Double.parseDouble(decimalFormat.format(money % coins[i]));

        }

     
        // Closing scanner
        input.close();
    }
}
