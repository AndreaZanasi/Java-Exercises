package exercises.notes.interfaces.basic;

public class Pencil {
    public String draw(Curve curve) {
        return "i'm a pencil drawing" + curve.draw();
    }
}
