abstract class Shape {
    protected double dim1;
    protected double dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);    // length = 10, width = 5
        Shape tri = new Triangle(8, 4);       // base = 8, height = 4

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}

