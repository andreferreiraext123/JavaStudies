package basic_concepts;

public class TypeCasting {
    public static void main(String[] args){

        // Widening Casting: is done automatically when  passing a smaller size type to a large size type
        int myInteger = 10; //Outputs: 10
        double myDouble = myInteger; // Outputs: 10.0

        //Printing OP
        System.out.println("Widening Casting " + myDouble);

        // Narrowing Casting: Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
        double myDoubleS= 10.32d; // Outputs: 10.32
        int myIntegerS = (int) myDoubleS; // Outputs: 10

        // Printing OP
        System.out.println("Narrowing Casting: " + myIntegerS);
    }
}
