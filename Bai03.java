package labtuan4;

public class Bai03 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println("Shape: " + shape.toString());

        CircleBai03 circle = new CircleBai03(2.0, "green", true); 
        System.out.println("Circle: " + circle.toString());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

        Square square = new Square(2.5, "purple", true);
        System.out.println("Square: " + square.toString());
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}