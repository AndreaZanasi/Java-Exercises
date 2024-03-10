package exercises.arrays;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2){

        double[] divided = new double[v1.length];
        System.arraycopy(v1, 0, divided, 0, v1.length);

        for(int i = 0; i < v1.length; i++) {
            divided[i] /= v2[i];
        }

        return divided;
    }
}
