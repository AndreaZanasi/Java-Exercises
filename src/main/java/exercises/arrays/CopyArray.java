package exercises.arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] copy = new double[v.length];

        for (int i = 0; i < v.length; i++) {
            copy[i] = v[i];
        }

        return copy;
    }
}
