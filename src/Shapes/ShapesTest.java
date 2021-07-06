package Shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        Rectangle square1 = new Rectangle(5,4);
//        System.out.println(square1.getPerimeter());
//        System.out.println(square1.getArea());
//        System.out.println();

        Measurable myShape = new Square(5);
        System.out.println(((Square) myShape).getLength());
        System.out.println(((Square) myShape).getWidth());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


    }


}
