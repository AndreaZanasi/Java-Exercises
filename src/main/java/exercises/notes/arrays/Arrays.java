package exercises.notes.arrays;

import java.util.Scanner;

public class Arrays {

    //in memoria i dati di un array sono contigui
    //creating an array
    int[] vector = {1, 2, 3, 4, 5, 6, 7};
    String[] names = {"Andrea", "Luca", "Mario"};

    int[] zeros = new int[5]; //all zeros
    String[] nulls = new String[5]; //all nulls

    //multi-dimensional array
    int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

    public void method() {
        //to access and assign an element
        zeros[1] = 5;
        System.out.println(vector[1]);

        //iteration in arrays
        int index = 0;
        while(index < vector.length) {
            System.out.println(vector[index]);
            index++;
        }

        for(index = 0; index < vector.length; index++) {
            System.out.println(vector[index]);
        }

        for(int number : vector) {
            System.out.println(number);
        }
    }

    public static void numberReader() {
        //Scanner type is used to read from the std-input
        Scanner reader = new Scanner(System.in);
        System.out.print("How many numbers? ");
        //nextInt function scans the next token in input as an int
        int howMany = reader.nextInt();

        int[] numbers = new int[howMany];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = reader.nextInt();
        }

        System.out.println("Here are the numbers again:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //passing arrays to methods
    public static void listElements(int[] integerArray) {
        for (int n : integerArray) {
            System.out.println(n);
        }
    }

    //Array is an object, so when you change the array inside
    // the method, the changes persist after the execution of
    // the method.2
    public static void fill(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    public static void main(String[] args) {
        Arrays.numberReader();

        //passing arrays to methods
        int[] numbers = {1, 2, 3};
        Arrays.listElements(numbers);

        //Array is an object, so when you change
        // the array inside the method, the changes
        // persist after the execution of the method.
        Arrays.fill(numbers, 5);
        for (int number : numbers) {
            System.out.println(number);
        }

        //java.util.Arrays useful methods
        /*
        copyOf() / copyOfRange
        fill()
        equals() / deepEquals()
        hashCode() / deepHashCode()
        sort()
        binarySearch()
        toString() / deepToString()
        asList()
        setAll()
        */

        /**
         * guide
         * https://www.baeldung.com/java-arrays-guide
         * https://www.baeldung.com/java-util-arrays
         */

    }
}
