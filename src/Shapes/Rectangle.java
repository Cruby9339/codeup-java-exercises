package Shapes;

public class Rectangle {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

}
