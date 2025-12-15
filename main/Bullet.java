public class Bullet {
    int x, y;
    int speed = 12;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x += speed;
    }

}