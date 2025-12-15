import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel{

    Image img;
    private int x;
    private int y;
    ArrayList<Bullet> bullets = new ArrayList<>();

    public ImagePanel() {
        img = new ImageIcon("img/player.png").getImage();
        x = 40;
        y = 100;
    }

    public void addBullet(Bullet b) {
        bullets.add(b);
    }

    public void startTimer() {
        new Timer(30, e -> {
            for (Bullet b : bullets) {
                b.move();
            }
            repaint();
        }).start();
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
        if (y < 0) y = 0;
        if (y > 800 - 80) y = 800 - 80;
        this.y = y;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x, y, 80, 80, this);

        for (Bullet b : bullets) {
            g.fillRect(b.x, b.y, 10, 5);
        }
    }
}