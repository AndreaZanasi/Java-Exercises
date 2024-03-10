package exercises.arrays;

public class Splitter {
    public static int[] splitter(int input) {
        String stringNumber = Integer.toString(input);
        int size = stringNumber.length();

        int[] out = new int[size];

        for(int i = 0; i < size; i++) {
            out[i] = Character.getNumericValue(stringNumber.charAt(i));
        }

        return out;
    }
}
