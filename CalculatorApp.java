public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two ints: " + calc.add(5, 10));
        System.out.println("Add two doubles: " + calc.add(3.5, 2.5));
        System.out.println("Add three ints: " + calc.add(1, 2, 3));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
