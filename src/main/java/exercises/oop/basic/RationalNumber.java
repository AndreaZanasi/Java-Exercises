package exercises.oop.basic;
import java.util.Objects;

public class RationalNumber {

    private final int numerator;
    private final int denominator;
    public RationalNumber(int numerator, int denominator) {

        int divisor = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / divisor;
        this.denominator = denominator / divisor;

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber o) {

        int newdenominator = leastCommonMultiple(denominator, o.getDenominator());
        int newnumerator = numerator * (newdenominator / denominator) + o.getNumerator() * (newdenominator / o.getDenominator());

        return new RationalNumber(newnumerator, newdenominator);
    }

    public RationalNumber multiply(RationalNumber o) {

        int newnumerator = numerator * o.getNumerator();
        int newdenominator = denominator * o.getDenominator();

        return new RationalNumber(newnumerator, newdenominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

}
