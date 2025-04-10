import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    // Method to set dimensions
    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to get area
    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        rect.setDim(l, b); // set the dimensions

        System.out.println("Area of Rectangle = " + rect.getArea());

        sc.close();
    }
}

