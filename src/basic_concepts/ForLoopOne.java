package basic_concepts;
// Printing each element from a list

public class ForLoopOne {
    // Storing the car's name in a array
    static String[] cars
            = {"Mercedes", "Volkswagen", "BMW", "Ferrari", "Fiat", "Peugeot"};

    public static void main(String[] args) {

        for (String element: cars){ // Accessing the list named cars, with the element named element, that will increase your index automatilly
            System.out.println(element);
        }
        checkingNumbersInAList();

    }

    public static void checkingNumbersInAList(){
        Integer[] numbers = {10,20,30,40,50,32,2};
        for (int num: numbers){
            if (num == 2){
                System.out.println("Number 2 was found");
            }
            else{
                System.out.println("Number 2 didn't found");
            }
        }
        System.out.println(cars[0]);
    }

    public static void checkingCarsNameOtherWay(){
        for (int car = 0; car < cars.length; car++){
            System.out.println(car);
        }
    }
}
