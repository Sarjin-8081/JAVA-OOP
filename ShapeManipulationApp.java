public class ShapeManipulationApp {
    public static void main(String[] args) {
        TransformShape circle = new CircleShape();
        TransformShape square = new Square();
        TransformShape triangle = new TriangleShape();

        circle.resize();
        circle.rotate();

        square.resize();
        square.rotate();

        triangle.resize();
        triangle.rotate();
    }
}

abstract class TransformShape {
    abstract void resize();
    abstract void rotate();
}

class CircleShape extends TransformShape {
    void resize() {
        System.out.println("Resizing circle...");
    }
    void rotate() {
        System.out.println("Rotating circle...");
    }
}

class Square extends TransformShape {
    void resize() {
        System.out.println("Resizing square...");
    }
    void rotate() {
        System.out.println("Rotating square...");
    }
}

class TriangleShape extends TransformShape {
    void resize() {
        System.out.println("Resizing triangle...");
    }
    void rotate() {
        System.out.println("Rotating triangle...");
    }
}
