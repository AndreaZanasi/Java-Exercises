package exercises.arrays;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSortCopy(int[] v){

        int[] copy = Arrays.copyOf(v, v.length);
        bubbleSort(copy);
        return copy;
    }
    public static void bubbleSort(int[] v){

        boolean flag = true;
        while (flag) {
            flag = false;
            for(int i = 0; i < v.length - 1; i++) {
                if(v[i] > v[i + 1]){
                    flag = true;
                    int tmp = v[i + 1];
                    v[i + 1] = v[i];
                    v[i] = tmp;
                }
            }
        }
    }
}
