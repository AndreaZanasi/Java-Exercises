package exercises.notes.polymorphism;

public class App {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[] {new Dog(), new Cat(), new Cat(), new Dog()};
        for (Mammal mammal : mammals) {
            mammal.sayHello();
        }
    }
    // essendo che mammal è la classe dominante posso comprendere al suo interno sia dog che cat
    // dunque il polimorfismo sta proprio in questo l'array è l'esempio più ovvio
}
