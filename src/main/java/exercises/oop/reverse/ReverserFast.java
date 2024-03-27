package exercises.oop.reverse;

public class ReverserFast implements Reverser{

    @Override
    public String reverse(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }
}
