

public package Inheritance.Task_Inheritance;

// Question 5: Implement a class hierarchy for various shapes. 
// Create a base class 'Shape' with a method 'calculateArea()'. 
// Derive two classes 'Rectangle' and 'Circle' from 'Shape'. 
// Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. 
// Write a Java program to demonstrate hierarchical inheritance and compute the 
// area and perimeter/circumference for a rectangle and a circle object.

class Shape {
    void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circle Circumference: " + circumference);
    }
}

public class t5 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(6, 4);
        rect.calculateArea();
        rect.calculatePerimeter();

        System.out.println();

        Circle circle = new Circle(3);
        circle.calculateArea();
        circle.calculateCircumference();
    }
} {
    
}
