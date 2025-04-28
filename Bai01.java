package labtuan4;
public class Bai01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        circle.setColor("blue");

        System.out.println(circle.toString());
        System.out.println("Area of Circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, 3.0);
        cylinder.setColor("green");

        System.out.println(cylinder.toString());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }
}
