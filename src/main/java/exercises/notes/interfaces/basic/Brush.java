package exercises.notes.interfaces.basic;

public class Brush {
    public String draw(Curve curve) {
        return "i'm a brush drawing" + curve.draw();
    }
}
