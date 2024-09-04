package beecrowd;
import java.util.Scanner;

public class Exe1010 {
    public static void main(String[] args) {
        // Storing data
        Scanner input = new Scanner(System.in);
        int codeFirst, quantityFirst, codeSecond, quantitySecond;
        double unitValueFirst, unitValueSecond, totalValue,totalValueFirst, totalValueSecond;

        // Inputting data
        codeFirst = input.nextInt();
        quantityFirst = input.nextInt();
        unitValueFirst = input.nextDouble();

        codeSecond = input.nextInt();
        quantitySecond = input.nextInt();
        unitValueSecond = input.nextDouble();

        // Calculates
        totalValueFirst = quantityFirst * unitValueFirst;
        totalValueSecond = quantitySecond * unitValueSecond;
        totalValue = totalValueFirst + totalValueSecond;

        // Printing results
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);


        //Closing scanner
        input.close();
    }
}