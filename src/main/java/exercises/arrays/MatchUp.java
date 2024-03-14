package exercises.arrays;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2) {
        int out = 0;

        for (int i = 0; i < v1.length; i++) {
            if (Math.abs(v1[i] - v2[i]) <= 2 && v1[i] != v2[i]) {
                out++;
            }
        }

        return out;
    }
}