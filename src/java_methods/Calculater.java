package java_methods;
// Do a program separate by method where each method has an operation, that returns the result between two numbers

public class Calculater {
    public static void main(String[] args) {
        int num_1 = 10, num_2 = 20;

        System.out.println("Sum between: " + num_1 + " + " + num_2 + " = " + sum(num_1,num_2));
        System.out.println("Subtraction between: " + num_1 + " - " + num_2 + " = " + sub(num_1,num_2));
        System.out.println("Multiplication between: " + num_1 + " * " + num_2 + " = " + multi(num_1,num_2));
        System.out.println("Division between: " + num_1 + " / " + num_2 + " = " + div(num_1,num_2));
    }
    // Operators methods
    public static int sum(int num_1, int num_2){
        return num_1 + num_2;
    }
    public static int multi(int num_1, int num_2){
        return  num_1 * num_2;
    }
    public static int sub(int num_1, int num_2){
        return num_1 - num_2;
    }
    public static float div(int num_1, int num_2){
        return  num_1 / num_2;
    }
}
