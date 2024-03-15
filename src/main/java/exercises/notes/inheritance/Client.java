package exercises.notes.inheritance;

public class Client extends Person{
    String contactNumber;
    boolean gold;

    public Client(String name, int yearOfBirth, String address, String contactNumber, boolean gold) {
        super(name, yearOfBirth, address);
        this.contactNumber = contactNumber;
        this.gold = gold;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public boolean isGold() {
        return gold;
    }
}
