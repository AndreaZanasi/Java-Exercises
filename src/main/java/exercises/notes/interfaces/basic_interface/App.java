package exercises.notes.interfaces.basic_interface;

import exercises.notes.interfaces.basic.Brush;
import exercises.notes.interfaces.basic.Curve;
import exercises.notes.interfaces.basic.Pencil;

public class App {
    public static void main(String[] args) {
        System.out.println(new Brush().draw(new Curve()));
        System.out.println(new Pencil().draw(new Curve()));
        new DrawingTool();
    }
}
