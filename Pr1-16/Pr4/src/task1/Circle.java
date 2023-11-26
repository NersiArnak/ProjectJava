package task1;

public class Circle {
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius =radius;
    }

    public double getRadius(){
        return radius;
    }

    public String toString() {
        return "radius - " + getRadius();
    }
}

