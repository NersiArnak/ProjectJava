package Task1;
import java.lang.*;
public class Circle extends Shape {
    protected double radius;
    public Circle(){
        super("blue", false);
        radius = 1;
    }

    public Circle(double radius){
        super("blue", false);
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color:" + this.color;
    }
}
