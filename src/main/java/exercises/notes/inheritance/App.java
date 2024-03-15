package exercises.notes.inheritance;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Programmer p = new Programmer(
                "Andrea",
                2003,
                "Via lol 6",
                LocalDate.of(2023, 15, 06),
                500_000L,
                new String[] {"C", "Java", "Python"}
        );

        long l = 12L;
        byte b = (byte)244L;

        Client c = new Client(
                "Thomas",
                1899,
                "Turbato 34",
                "566-888-9890",
                true
        );

        Client pc = new Client(
                "Zu",
                1999,
                "Anche 34",
                "689-888-9890",
                false
        );

        Person[] people = new Person[]{p, c, pc};

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
