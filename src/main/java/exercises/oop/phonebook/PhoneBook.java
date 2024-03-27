package exercises.oop.phonebook;

public interface PhoneBook {

    public boolean addPerson(Person p);
    public boolean removePerson(Person p);
    public Person[] searchByLastname(String lastname);
    public Person[] searchByNameAndLastname(String lastname, String name);

}
