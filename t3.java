package Inheritance.Task_Inheritance;

// Question 3: Imagine that you are building a geometry calculator program. 
// You need to implement the calculation of areas for different shapes, 
// including rectangles, squares, and circles. To achieve this, you decide 
// to use a multilevel inheritance hierarchy.

class Shape {
    double length;
    double breadth;
    double radius;

    Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Shape(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    void calculateArea() {
        double area = length * length;
        System.out.println("Square Area: " + area);
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super(radius);
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class t3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        rect.calculateArea();

        Square square = new Square(4);
        square.calculateArea();

        Circle circle = new Circle(2.5);
        circle.calculateArea();
    }
}