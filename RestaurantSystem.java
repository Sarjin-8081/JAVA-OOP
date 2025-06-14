interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Chef is cooking delicious meals.");
    }

    @Override
    public double getSalary() {
        return 50000.0;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return 30000.0;
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        chef.work();
        System.out.println("Chef Salary: Rs. " + chef.getSalary());

        waiter.work();
        System.out.println("Waiter Salary: Rs. " + waiter.getSalary());
    }
}
