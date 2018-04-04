package shapesOne;

public class Square extends Shape{

    public Square(double side) {
        super(side);
        }

     @Override
    public double caculateArea(){
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return super.toString();
    }







}
