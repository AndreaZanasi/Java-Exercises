package exercises.arrays;

import java.util.Arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor){
        double[] divided = new double[v.length];
        System.arraycopy(v, 0, divided, 0, v.length);

        for(int i = 0; i < v.length; i++) {
            divided[i] /= factor;
        }

        return divided;
    }
}
