package exercises.notes.interfaces.basic;

public class App {
    public static void main(String[] args) {
        System.out.println(new Brush().draw(new Curve()));
        System.out.println(new Pencil().draw(new Curve()));
    }
}
