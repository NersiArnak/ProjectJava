package Task2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    //public Ball{}{}
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(double x){
        return x;
    }

    public double getY(double y){
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override // указывает компилятору, что метод, который следует за аннотацией, переопределяет метод из родительского класса или интерфейса.
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }

}
