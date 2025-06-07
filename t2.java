package Inheritance.Task_Inheritance;

// Question 2: 
// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method.

class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
    double getSalary() {
        return 30000.0; 
    }
}
class HRManager extends Employee {

    @Override
    void work() {
        System.out.println("HR Manager is hiring employees and managing HR tasks...");
    }
}

public class t2 {
    public static void main(String[] args) {

        Employee genericEmployee = new Employee();
        genericEmployee.work();
        System.out.println("Employee Salary: $" + genericEmployee.getSalary());

        System.out.println();

        HRManager hr = new HRManager();
        hr.work();  
        System.out.println("HR Manager Salary: $" + hr.getSalary());  
    }
}