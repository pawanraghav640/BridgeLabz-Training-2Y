import java.util.Scanner;

public class Circle {
    double radius;

    // Constructor to initialize Circle object
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.display();

        scanner.close();
    }
}
