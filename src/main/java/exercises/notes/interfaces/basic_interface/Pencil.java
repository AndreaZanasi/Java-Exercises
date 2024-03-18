package exercises.notes.interfaces.basic_interface;

public class Pencil implements DrawingTool, ColoredDrawingTool{
    @Override
    public String draw(Curve curve) {
        return "i'm a pencil drawing" + curve.draw();
    }

    @Override
    public void fillColor(Curve curve){

    }
}
