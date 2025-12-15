public class EnemyBullet {
    int x, y;
    int speed = 8;

    public EnemyBullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move() {
        x -= speed;
    }
}