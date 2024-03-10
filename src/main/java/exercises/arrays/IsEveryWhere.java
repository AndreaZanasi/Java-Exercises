package exercises.arrays;

public class IsEveryWhere {
    public static boolean isEveryWhere(int[] v, int value) {
        boolean result = true;

        for(int i = 0; i < v.length; i++) {
            if(i + 1 != v.length){
                if(v[i] == value || v[i + 1] == value) {
                    result = true;
                }
                else{
                    result = false;
                }
            }
        }

        return result;
    }
}
