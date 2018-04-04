package shapesOne;

public class Shape {

    private double side;


        public Shape(double side){
            this.side = side;
        }

        public double caculateArea(){
            return 0.0;
        }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }

    public double getSide(){
            return this.side;
        }

        public void setSide(){
            this.side = side;
        }
}

