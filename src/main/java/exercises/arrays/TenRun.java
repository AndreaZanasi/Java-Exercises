package exercises.arrays;

public class TenRun {
    public static int[] tenRun(int[] v) {
        int[] ten_run = new int[v.length];
        int multiple = 0;

        for(int i = 0; i < v.length; i++) {
            if(v[i] / 10 < 1 && multiple != 0) {
                ten_run[i] = multiple;
            }
            else {
                ten_run[i] = v[i];
                if(v[i] % 10 == 0) {
                    multiple = v[i];
                }
            }
        }

        return ten_run;
    }
}
