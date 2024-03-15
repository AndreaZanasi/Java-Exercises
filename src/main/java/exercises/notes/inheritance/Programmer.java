package exercises.notes.inheritance;

import java.time.LocalDate;

public class Programmer extends Employee{
    String[] language;

    public Programmer(String name, int yearOfBirth, String address, LocalDate startDate, Long salary, String[] language) {
        super(name, yearOfBirth, address, startDate, salary);
        this.language = language;
    }

    public Programmer(String[] language) {
        this.language = language;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }
}
