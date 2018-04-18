import java.awt.*;

/**
 * Created by владислав on 15.04.2018.
 */
public class Bullet {

    private double x;
    private double y;
    private int r;
    private int speed;

    Color color1;


    public Bullet() {
        x = GamePanel.player.getX();
        y = GamePanel.player.getY();
        r = 2;
        speed = 10;
        color1 = Color.WHITE;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public boolean remove() {
         if (y < 0)
             return true;
        return false;
    }
    public void update() {
        y -= speed;
    }

    public void draw(Graphics2D g) {
        g.setColor(color1);
        g.fillOval((int) x, (int) y, r,2 * r);
    }
}