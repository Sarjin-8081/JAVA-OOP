public class CarRentalApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle bicycle = new Bicycle();

        System.out.println("Car Rental Cost (3 days): $" + car.calculateRentalCost(3));
        System.out.println("Motorcycle Rental Cost (3 days): $" + motorcycle.calculateRentalCost(3));
        System.out.println("Bicycle Rental Cost (3 days): $" + bicycle.calculateRentalCost(3));
    }
}

abstract class Vehicle {
    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    double calculateRentalCost(int days) {
        return days * 50;
    }
}

class Motorcycle extends Vehicle {
    double calculateRentalCost(int days) {
        return days * 30;
    }
}

class Bicycle extends Vehicle {
    double calculateRentalCost(int days) {
        return days * 10;
    }
}
