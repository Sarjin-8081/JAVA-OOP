abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
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

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
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

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeHierarchyTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.println("Circle -> Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle -> Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle -> Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}
