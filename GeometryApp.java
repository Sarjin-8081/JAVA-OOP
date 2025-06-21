public class GeometryApp {
    public static void main(String[] args) {
        Geometry g = new Geometry();

        System.out.println("Area of circle: " + g.calculateArea(5.0));
        System.out.println("Area of rectangle: " + g.calculateArea(4.0, 6.0));
        System.out.println("Area of triangle: " + g.calculateArea(3.0, 7.0, true));
    }
}

class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }
}
