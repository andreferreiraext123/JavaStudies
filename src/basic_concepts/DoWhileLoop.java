package basic_concepts;

public class DoWhileLoop {
    public static void main(String[] args) {
        int num = 0;

        do {
            System.out.println(num);
            num++; // This is like = num = num + 1
        }
        while (num > 10); // Same is false the condition it executes one last time
    }
}
