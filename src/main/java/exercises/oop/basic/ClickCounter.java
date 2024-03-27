package exercises.oop.basic;

public class ClickCounter {

    int clicks = 0;

    public int getValue() {
        return clicks;
    }

    public void click() {
        clicks += 1;
    }

    public void undo() {
        if(clicks > 0) {
            clicks -= 1;
        }
    }

    public void reset() {
        clicks = 0;
    }

}
