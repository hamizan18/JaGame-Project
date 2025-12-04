import javax.swing.*;
import java.awt.*;

public class Direction {
    int increment = 0, decrement = 0;
    private ImagePanel direction;

    public Direction(ImagePanel direction) {
        this.direction = direction;
    }
    public void turnLeft() {
        decrement = direction.getXpos() - 10;
        direction.setXpos(decrement);
    }
    public void turnRight() {
        increment = direction.getXpos() + 10;
        direction.setXpos(increment);
    }
    public void turnUp() {
        decrement = direction.getYpos() - 10;
        direction.setYpos(decrement);
    }
    public void turnDown() {
        increment = direction.getYpos() + 10;
        direction.setXpos(increment);
    }
}