public class ComparisonOp {
    public static void main(String[] args){
        /* Comparison operators are used to compare two values (or variables).
        This is important in programming, because it helps us to find answers and make decisions.*/
        int numFirst = 10;
        int numSecond = 20;

        // Printing the numbers
        System.out.println("First num: " + numFirst);
        System.out.println("Second num: " + numSecond);

        // Comparison Op: (n > n) check if the first number is greater than second num.
        boolean greater = numFirst > numSecond;
        System.out.println("Greater: " + greater);

        // Comparison Op: (n < n) check if the first number is less than second number.
        boolean less = numFirst < numSecond;
        System.out.println("Lenss than: " + less);

        // Comparison Op: (n == n) check if the first number is the same than second number.
        boolean equal = numFirst == numSecond;
        System.out.println("Equal " + equal);

        // Comparison Op: (n =! n) check if the first num is different than second
        boolean different = numFirst != numSecond;
        System.out.println("Different: " + different);

        // Comparison Op = How to crease 1 to a variable
        System.out.println("Creasing 1 to: " + ++numSecond);


    }
}
