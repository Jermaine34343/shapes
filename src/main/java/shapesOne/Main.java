package shapesOne;

public class Main {
    public static void main(String[] args) {

        Shape shapeOne = new Square(23);
        System.out.println(shapeOne.caculateArea());
        Shape shapeTwo = new Rectangle(10,5);
        System.out.println(shapeTwo.caculateArea());
    }

}
