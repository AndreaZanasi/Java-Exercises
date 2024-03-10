package exercises.arrays;
import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] array = new double[size];

        if(!addNoise) {
            Arrays.fill(array, value);
        }
        else{
            RandomGenerator rnd = RandomGenerator.getDefault();
            for(int i = 0; i < size; i++){
                array[i] += (rnd.nextDouble(value * 0.1) - value * 0.5);
            }
        }

        return array;
    }
}
