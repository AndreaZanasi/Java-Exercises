package exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end) {
        String[] fizzbuzz = new String[end - start];
        int j = 0;

        for (int i = start; i < end; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                fizzbuzz[j] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                fizzbuzz[j] = "Fizz";
            }
            else if (i % 5 == 0 ) {
                fizzbuzz[j] = "Buzz";
            }
            else {
                fizzbuzz[j] = Integer.toString(i);
            }
            j++;
        }

        return fizzbuzz;
    }
}
