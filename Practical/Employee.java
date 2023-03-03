package corejava;
//create Employee class
class Employee {
    String name;
    int id;
    double salary;
//create parameterized constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}
//create Manager class and used extends keyword
class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }
//used super constructor from Employee class
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Clerk extends Employee {
    int hoursWorked;

    Clerk(String name, int id, double salary, int hoursWorked) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
//create main class
public class Main {
    public static void main(String[] args) {
  //create object of class
        Manager manager = new Manager("John Smith", 1001, 50000.0, "Sales");
        Clerk clerk = new Clerk("Jane Doe", 2001, 25000.0, 40);
        manager.displayDetails();
        clerk.displayDetails();
    }
}