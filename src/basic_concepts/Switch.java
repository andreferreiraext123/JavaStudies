package basic_concepts;

public class Switch {
    public static void main(String[] args) {
        int day = 4; // Storing data of the expression

        switch (day) { // The value of the expression is compared with the values of each case.
            case 1:
                System.out.println("Monday");
                break; // When Java reaches a break keyword, it breaks out of the switch block.
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // The default keyword specifies some code to run if there is no case match:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
