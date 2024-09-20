package java_methods;
/*
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
instead of void, and use the return keyword inside the method:
 */
public class ReturningValues {
    public static void main(String[] args) {
        System.out.println(sum(10,20)); // Calling the method sum, with the arguments 10 and 20.
    }
    public static int sum(int num_1, int num_2){
        return num_1 + num_2;
    }
}

