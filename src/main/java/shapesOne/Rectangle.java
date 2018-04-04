package shapesOne;

public class Rectangle extends Shape {

    private double length;

    public Rectangle(double side, double length) {
        super(side);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double caculateArea(){
        return getSide() * getLength();
    }






}
