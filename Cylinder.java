package labtuan4;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
public double getVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() + ", height=" + getHeight() + "]";
    }

}

