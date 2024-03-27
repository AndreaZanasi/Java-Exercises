package exercises.oop.reverse;

public class ReverserSlow implements Reverser{

    @Override
    public String reverse(String string) {

        char[] copy = string.toCharArray();
        char[] reversed = new char[copy.length];

        int j = copy.length - 1;
        for(int i = 0; i < copy.length; i++) {
            reversed[i] = copy[j];
            j--;
        }

        return new String(reversed);
    }
}
