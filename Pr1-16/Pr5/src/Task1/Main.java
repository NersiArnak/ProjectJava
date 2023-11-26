package Task1;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);      // which version?
        System.out.println(s1.getArea());    // which version?
        System.out.println(s1.getPerimeter());   // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        Circle c1 = (Circle) s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());

        // Take note that we downcast Shape s4 to Square instead of Rectangle
        Square sq1 = (Square) s4;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        //System.out.println(sq1.getLength());

        System.out.println("4 Упражнение");
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        MovableCircle proba = new MovableCircle(0, 0, 2, 3, 3);
        System.out.println(proba);
        System.out.println("5 Упражнение");
        MovableRectangle test = new MovableRectangle(1, 2, 3, 4, 5, 6 );
        System.out.println(test);
    }
}