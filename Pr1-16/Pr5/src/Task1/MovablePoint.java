package Task1;
import java.lang.*;
public class MovablePoint implements MovableInterface.Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override

    public String toString() {
        return "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
    }

    @Override

    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override

    public void moveLeft() {
        x -= xSpeed;
    }

    @Override

    public void moveRight() {
        x -= xSpeed;
    }
}


