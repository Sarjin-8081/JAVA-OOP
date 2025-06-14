abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return side * side * side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double length, width, height;

    Cuboid(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    double radius, height;

    Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius * 2; // circumference of both bases
    }
}

public class DrawTest {
    public static void main(String[] args) {
        Draw cube = new Cube(3);
        Draw cuboid = new Cuboid(4, 5, 6);
        Draw cylinder = new Cylinder(2, 7);

        System.out.println("Cube -> Volume: " + cube.calculateVolume() + ", Area: " + cube.calculateArea() + ", Perimeter: " + cube.calculatePerimeter());
        System.out.println("Cuboid -> Volume: " + cuboid.calculateVolume() + ", Area: " + cuboid.calculateArea() + ", Perimeter: " + cuboid.calculatePerimeter());
        System.out.println("Cylinder -> Volume: " + cylinder.calculateVolume() + ", Area: " + cylinder.calculateArea() + ", Perimeter: " + cylinder.calculatePerimeter());
    }
}
