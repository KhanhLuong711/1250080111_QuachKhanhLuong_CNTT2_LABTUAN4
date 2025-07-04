package labtuan4;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
