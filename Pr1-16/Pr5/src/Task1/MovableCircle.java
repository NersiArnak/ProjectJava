package Task1;
import java.lang.*;
public class MovableCircle implements MovableInterface.Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return center + ", radius=" + radius;
    }


    @Override

    public void moveUp() {
        center.moveUp();
    }

    @Override

    public void moveDown() {
        center.moveDown();
    }

    @Override

    public void moveLeft(){
        center.moveLeft();
    }

    @Override

    public void moveRight(){
        center.moveRight();
    }

}
