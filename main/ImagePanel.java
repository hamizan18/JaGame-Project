import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel{

    Image img;
    private int x;
    private int y;

    public ImagePanel() {
        img = new ImageIcon("img/player.png");
        x = 40;
        y = 100;
    }

    public int getXpos() {
        return x;
    }

    public int getYpos() {
        return y;
    }

    public void setXpos(int x) {
        this.x = x;
    }

    public void setYpos(int y) {
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, 80, 80, this);
    }

}