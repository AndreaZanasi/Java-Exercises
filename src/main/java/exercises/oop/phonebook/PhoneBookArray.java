package exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{

    static final int MAX_PERSONS = 256;
    Person[] phonebook;
    private int count;

    public PhoneBookArray(Person[] phonebook) {
        this.phonebook = phonebook;
        phonebook = new Person[MAX_PERSONS];
        int count = 0;
    }

    @Override
    public boolean addPerson(Person p) {
        for(int i = 0; i < count; i++) {
            if (p.equals(phonebook[i])) {
                return false;
            }
        }

        phonebook[count + 1] = p;
        count++;
        return true;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < count; i++) {
            if (p.equals(phonebook[i])) {
                for (int j = i; j < count; j++) {
                    phonebook[j] = phonebook[j + 1];
                }
                count--;
                return true;
            }
        }

        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int counter = 0;

        for (int i = 0; i < count; i++) {
            if (lastname.equals(phonebook[i].lastname)) {
                counter++;
            }
        }

        int j = 0;
        Person[] samelastname = new Person[counter];
        for (int i = 0; i < count; i++) {
            if (lastname.equals(phonebook[i].lastname)) {
                samelastname[j] = phonebook[i];
                j++;
            }
        }

        return samelastname;
    }

    @Override
    public Person[] searchByNameAndLastname(String lastname, String name) {
        int counter = 0;

        for (int i = 0; i < count; i++) {
            if (lastname.equals(phonebook[i].lastname) && name.equals(phonebook[i].name)) {
                counter++;
            }
        }

        int j = 0;
        Person[] samelastnameandname = new Person[counter];
        for (int i = 0; i < count; i++) {
            if (lastname.equals(phonebook[i].lastname) && name.equals(phonebook[i].name)) {
                samelastnameandname[j] = phonebook[i];
                j++;
            }
        }

        return samelastnameandname;
    }
}
