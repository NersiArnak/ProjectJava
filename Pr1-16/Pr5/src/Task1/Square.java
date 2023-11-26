package Task1;

public class Square extends Shape {

    protected double side;
    public Square() {
        super("blue", false);
        this.side = 0;

    }
    public Square(double side) {
        super("blue", false);
        this.side = side;


    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    //@Override

    public void setWidth(double side) {
        this.side = side;
    }
    //@Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
    @Override

    public String toString() {
        return "Shape square side: " + this.side + " color: "+ this.color;
    }
}
