package labtuan4;
class Square extends Rectangle {
    public Square() {
        super();  
        this.setWidth(1.0);  
        this.setLength(1.0); 
    }
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); 
    }

    public double getSide() {
        return getWidth(); 
    }
    public void setSide(double side) {
        setWidth(side);  
        setLength(side);
    }
    @Override
    public String toString() {
        return super.toString() + ", side = " + getSide(); 
    }
}
