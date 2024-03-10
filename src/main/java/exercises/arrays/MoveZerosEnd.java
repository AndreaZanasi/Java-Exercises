package exercises.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] out = new int[v.length];

        int j = 0;
        for(int i = 0; i < v.length; i++) {
            if(v[i] != 0){
                out[j] = v[i];
                j++;
            }
        }

        return out;
    }
}
