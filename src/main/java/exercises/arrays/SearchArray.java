package exercises.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchArray {
    public static boolean containsBruteForce(String[] strings, String searched) {
        boolean out = false;

        for (int i = 0; i < strings.length; i++) {
            if(searched.equals(strings[i])) {
                out = true;
                break;
            }
        }

        return out;
    }
    public static boolean containsBinary(String[] strings, String searched) {
        boolean out = false;

        String[] copy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(copy);
        return Arrays.binarySearch(copy, searched) >= 0;
    }
}
