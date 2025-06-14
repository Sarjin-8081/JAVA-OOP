

import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.calculateArea());

        sc.close();
    }
}

