import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " " + "Th employee is working");
    }

    public double getsalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class HRManager extends Employee {
    public HRManager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println(getName() + " (HR Manager) is working on HR-related tasks.");
    }

    public void addEmployee(Employee newEmployee) {
        System.out.println("HR Manager " + getName() + " added new employee: "
                + newEmployee.getName() + " (ID: " + newEmployee.getId() + ")");
    }
}

public class Assignment {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahuk", 101, 5660);
        emp1.work();
        System.out.println("salary: " + emp1.getsalary());
        HRManager hr = new HRManager("Abhishek", 450, 6708);
        hr.work();
        System.out.println("salary: " + hr.getsalary());
        Employee emp2 = new Employee("Esha", 103, 55000);
        hr.addEmployee(emp2);
    }
}
