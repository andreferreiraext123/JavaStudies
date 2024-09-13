package basic_concepts;
// The "inner loop" will be executed one time for each iteration of the "outer loop":

public class NestedLoops {
    public static void main(String[] args) {
        nestedFor();

    }

    public static void nestedFor(){
        int i = 0;
        int j = 0;
        for (i = 0; i < 5;i++){
            System.out.println(i);
            for (i = 0;i < 6; i++ ){
                System.out.println(j);
            }
        }
        System.out.println("old i "+ i);
        System.out.println("new i "+ i);
    }
}
