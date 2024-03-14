package exercises.notes;

public class Patient {
    String name;
    int age;
    double weight;

    public static void sayHello() {
        System.out.println("Hello");
        sayHelloAgain();
    }

    public String getName(){
        return name;
    }

    public static void sayHelloAgain() {
        System.out.println("Hello Hello");
    }
}
