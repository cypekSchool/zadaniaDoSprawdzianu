import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        fibonacciExercise();
        numbersSegregation();
    }

    public static void fibonacciExercise() {
        int[] fibonacci = new int[40];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int element : fibonacci) {
            System.out.println(element + " ");
        }
    }

    public static void numbersSegregation() {
        int[] randomNumbers = new int[100];
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 100);
        }

        for (int number : randomNumbers) {
            if (number % 2 == 0) evenNumbers.add(number);
            else                 oddNumbers.add(number);
        }

        System.out.println("Ilość parzystych: " + evenNumbers.size());
        System.out.println(evenNumbers);
        System.out.println("Ilość nieparzystych: " + oddNumbers.size());
        System.out.println(oddNumbers);
    }
}