package basic_concepts;

public class Types {
    public static void main(String[] args){
       // Java Data Types
            /* Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
            Valid types are byte,short,int and long. Which type you should use, depends on the numeric value.*/
        // Byte: Store numbers without decimal from -128 to 127
        byte myNum = 100;
        System.out.println("Type: byte " + myNum);
        // Short: Can store numbers not decimal from -32768 to 32768
        short myNum0 = 5000;
        System.out.println("Type: short " + myNum0);
        // Int: can store whole numbers from -2147483648 to 2147483647
        int myNum1 = 100000000;
        System.out.println("Type: int " + myNum1);
        // Long: data type can store whole numbers from -9223372036854775808 to 9223372036854775807
        long myNum2 = 15000000000000000L;
        System.out.println("Type: long " + myNum2);

        // Floating Point Types: You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
        // Float
        float myNum3 = 32.2232f;
        System.out.println("Type: float " + myNum3);
        // Double
        double myNum4 = 3921.321321321d;
        System.out.println("Type: double " + myNum4);

        /*
        The precision of a floating point value indicates how many digits the value can have after the decimal point.
        The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits.
        Therefore, it is safer to use double for most calculations.
        */
    }

}
