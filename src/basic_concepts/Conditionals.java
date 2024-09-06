package basic_concepts;

public class Conditionals {
    public static void main(String[] args){
        int a = 10;
        int b = 0;

        if (a == 0 && b == 0) {
            System.out.println("They're empty");
        } else if (a > b){
            System.out.println("A is greater than B");
        } else {
            System.out.println("B is greater than A");
        }
    }
}
