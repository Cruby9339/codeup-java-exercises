package Shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input in = new Input(sc);
        System.out.println("Enter the Radius of a Circle");
        double userRadius = in.getDouble();
        Circle round = new Circle(userRadius);
        System.out.println(round.getArea());
        System.out.println(round.getCircumference());
    }

}
