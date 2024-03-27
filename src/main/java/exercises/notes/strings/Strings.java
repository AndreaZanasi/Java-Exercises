package exercises.notes.strings;

import java.time.Duration;

public class Strings {

    //Strings are immutable in Java
    public static void showStrings() {
        System.out.println("abc");
        String cde = "cde";
        //we can concatenate strings using + operator
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);

        //we can also use text blocks
        String textBlock = """
    He who becomes the slave of habit,
    who follows the same routes every day,
    who never changes pace,
    who does not risk and change the color of his clothes,
    who does not speak and does not experience,
    dies slowly.""";
        System.out.println(c);
        System.out.println(d);
        System.out.println(textBlock);
    }

    //in memory strings are stored only once
    /**
     * // memory use
     * String first = "Baeldung";
     *
     * // no actual memory use
     * String second = "Baeldung";
     *
     * // True
     * System.out.println(first == second);
     */

    //but if we use new operator:
    /**
     * // memory use
     * String first = new String("Baeldung");
     *
     * // memory use
     * String second = new String("Baeldung");
     *
     * // memory use
     * String third = "Baeldung";
     *
     * // False
     * System.out.println(first == second);
     *
     * // False
     * System.out.println(first == third);
     */

    //to compare strings we can use == or equals(), the difference is:
    //== is used to check if two strings point to the same object
    //equals() is used to check if 2 strings have the same content
    public static void checkStrings(String s1, String s2) {
        if (s1 == s2) {
            System.out.println("s1 and s2 point to the same object");
        } else {
            System.out.println("s1 and s2 point to different objects");
        }

        if (s1.equals(s2)) {
               System.out.println("s1 and s2 have the same content");
        }
        else {
                System.out.println("s1 and s2 have different contents");
            }
        }

        //stringBuilder is a useful type to control strings
        public static String concatenateSlow(int iterations) {
            // slow version
            String s = "";
            for (int i = 0; i < iterations; i++) {
                s += 'a';
            }
            return s;
        }

    public static String concatenateFast(int iterations) {
        // fast version using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append('a');
        }
        return sb.toString();
    }

    /**
     * Useful StringBuilder methods:
     *
     * charAt() Returns the character at the specified index (position)
     *
     * compareTo() Compares two strings lexicographically
     *
     * concat() Appends a string to the end of another string
     *
     * contains() Checks whether a string contains a sequence of characters
     *
     * endsWith() Checks whether a string ends with the specified character(s)
     *
     * isEmpty() Checks whether a string is empty or not
     *
     * length() Returns the length of a specified string
     *
     * replace() Searches a string for a specified value, and returns a new string where those values are replaced
     *
     * split() Splits a string into an array of substrings
     *
     * startsWith() Checks whether a string starts with specified characters
     *
     * substring() Returns a new string which is the substring of a specified string
     *
     * valueOf() Returns the string representation of the specified value
     */

    //Java has 3 streams: System.(in)(out)(err) the first is the input stream
    //2nd and 3rd are PrintStream
    public static void main(String[] args) {

        //Check Strings
        checkStrings("Hello World!", "Hello World!");
        checkStrings(new String("Hello World!"), new String("Hello World!"));
        checkStrings(new String("Hello World!"), new String("Hello Mars!"));

        //StringBuilder
        long start = System.nanoTime();
        concatenateSlow(10000);
        long end = System.nanoTime();
        System.out.println("Execution time: " + Duration.ofNanos(end - start).toMillis() + "ms");
    }

    /**
     * guides:
     * https://www.baeldung.com/java-string
     * https://www.baeldung.com/java-string-operations
     */

}
