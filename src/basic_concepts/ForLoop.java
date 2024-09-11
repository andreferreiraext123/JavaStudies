package basic_concepts;

// Do a loop for print message 'Yes' 5 times.
public class ForLoop {
    public static void main(String[] args) {
        String message = "Happy birthday to you!";
        // Statement 1 is executed (one time) before the execution of the code block.
        //
        //Statement 2 defines the condition for executing the code block.
        //
        //Statement 3 is executed (every time) after the code block has been executed.
        for (int count = 5; count > 0; count--){
            System.out.println(count);
        }
        System.out.println(message);
    }
}
