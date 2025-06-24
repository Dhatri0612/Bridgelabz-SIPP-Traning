public class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0);
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Circle 1 Area: " + c1.getArea());
        System.out.println("Circle 2 Area: " + c2.getArea());
    }
}
