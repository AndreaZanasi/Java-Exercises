package exercises.notes.inheritance;
import java.time.LocalDate;
public class Employee extends Person{
    LocalDate startDate;
    Long salary;

    public Employee(String name, int yearOfBirth, String address, LocalDate startDate, Long salary) {
        super(name, yearOfBirth, address);
        this.startDate = startDate;
        this.salary = salary;
    }

    public Employee(String name, int yearOfBirth, String address) {
        super(name, yearOfBirth, address);
    }

    public Employee() {
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Long getSalary() {
        return salary;
    }
}
