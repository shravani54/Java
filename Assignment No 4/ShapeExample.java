public class ShapeExample {

    public interface Shape {
        double area();
    }

    public static class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }
    }

    public static class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return 0.5 * base * height; 
        }
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 7.0);
        Shape triangle = new Triangle(6.0, 4.0);

        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
