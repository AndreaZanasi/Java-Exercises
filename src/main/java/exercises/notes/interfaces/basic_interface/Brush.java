package exercises.notes.interfaces.basic_interface;

public class Brush implements DrawingTool, ColoredDrawingTool{
    @Override
    public String draw(Curve curve){
        return "I'm a brush drawing" + curve.draw();
    }

    @Override
    public void fillColor(Curve curve){}
    //se non metto tutti i metodi che voglio implementare mi da errore
}
