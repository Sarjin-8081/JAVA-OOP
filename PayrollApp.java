public class PayrollApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();

        System.out.println("Employee Salary: $" + emp.calculateSalary());
        System.out.println("Manager Salary: $" + mgr.calculateSalary());
    }
}

class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    double calculateSalary() {
        return super.calculateSalary() + 10000;
    }
}
