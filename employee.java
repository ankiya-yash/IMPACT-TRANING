// Base class
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}


class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}


class Developer extends Employee {
    Developer(String name, int id, double salary) {
        super(name, id, salary);
    }

    void writeCode() {
        System.out.println(name + " is writing code.");
    }
}


public class employee {
    public static void main(String[] args) {
        Manager mgr = new Manager("Rohit Sharma", 101, 85000);
        Developer dev = new Developer("Priya Singh", 102, 75000);

        System.out.println("--- Manager Info ---");
        mgr.displayInfo();
        mgr.conductMeeting();

        System.out.println("\n--- Developer Info ---");
        dev.displayInfo();
        dev.writeCode();
    }
}
