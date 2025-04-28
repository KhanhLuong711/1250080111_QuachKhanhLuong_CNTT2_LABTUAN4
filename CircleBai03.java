package labtuan4;
public class CircleBai03 extends Shape {
    private double radius = 1.0;

    public CircleBai03() {
        super();
        this.radius = 1.0;
    }

    public CircleBai03(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
 public double getArea() {
        return Math.PI * radius * radius;
    }
   public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
