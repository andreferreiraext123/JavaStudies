public class AssgnmenTOp {
    public static void main(String[] args) {
        // Assignment operators are used to assign values to variables.
        int x = 10; // We're assigning the value 10 to variable called x

        x += 5; // Output's: 15
        System.out.println(x); //Outputs: 15

        x -= 5;
        System.out.println(x); // Outputs: 10

        x *= 5;
        System.out.println(x); // Outputs: 50

        x /= 5;
        System.out.println(x); // Outputs: 10

        x %= 5;
        System.out.println(x); // Outputs: 0

        x += 5; // Adding the value 5 for continues with the operations
        boolean z = true;
        boolean y = false;
        boolean result = y & z;  // Logical AND operation between y and z
        System.out.println("Result: " + result); // Outputs: false

    }
}