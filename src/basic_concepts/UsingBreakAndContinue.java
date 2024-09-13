package basic_concepts;

public class UsingBreakAndContinue {
    public static void main(String[] args) {
        stop();
        continua();
    }
    public static void stop(){
        /*
        break
        It was used to "jump out" of a switch statement.
        The break statement can also be used to jump out of a loop.
         This example stops the loop when i is equal to 4:
         */

        for (int i = 0; i <= 10; i++) {
            if (i == 4){
                break;
            }
            System.out.println(i); // Outputs: 0,1,2,3
        }
    }

    public static void continua(){
        /*
        The continue statement breaks one iteration (in the loop),
        if a specified condition occurs, and continues with the next iteration in the loop.
         */
        for (int i = 0; i <= 10; i++){
            if (i == 4){
                continue; // This will skip the iteration with the value 4
            }
            System.out.println(i); // Outputs: 0,1,2,3,5,6,7,8,9,10
        }
    }
}
