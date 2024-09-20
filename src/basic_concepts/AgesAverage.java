package basic_concepts;

import java.util.Arrays;

public class AgesAverage {
    public static void main(String[] args) {
        // Storing data
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0, lessAge = 0, biggerAge;

        for (int element: ages){
            sum += element;
        }


        lessAge = Arrays.stream(ages).min().getAsInt();
        biggerAge = Arrays.stream(ages).max().getAsInt();
        avg = sum / ages.length;

        System.out.println("The average between ages is: " + avg);
        System.out.println("The less age is: " + lessAge);
        System.out.println("The bigger age is: " + biggerAge);
    }

}
