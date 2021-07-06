package Shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side,side);
    }

    public double getLength() {
        return super.getLength();
    }
    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }
    public void setWidth(double side) {
        super.width = side;
        super.length = side;
    }

    public double getArea(){
        return Math.pow(this.length, 2);
    }
    public double getPerimeter(){
        return 4 * length;
    }

}
