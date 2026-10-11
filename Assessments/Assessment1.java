package Assessments;
import java.util.*;


abstract class Employee {
    int empId;
    String name;
    double basic, hra, ta, specialAllowance;

    Employee(int empId, String name, double basic, double hra,
             double ta, double specialAllowance) {
        this.empId = empId;
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.ta = ta;
        this.specialAllowance = specialAllowance;
    }

    abstract double getBonus();

    void display() {
        System.out.println("----------------------------------");
        System.out.println("Emp_id: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Bonus: Rs. " + (int) getBonus());
    }
}

class Manager extends Employee {
    Manager(int id, String name, double basic, double hra,
            double ta, double allowance) {
        super(id, name, basic, hra, ta, allowance);
    }

    double getBonus() {
        return (basic + hra) * 0.12;
    }
}

class Admin extends Employee {
    Admin(int id, String name, double basic, double hra,
          double ta, double allowance) {
        super(id, name, basic, hra, ta, allowance);
    }

    double getBonus() {
        return (basic + hra) * 0.10;
    }
}

class Engineer extends Employee {
    Engineer(int id, String name, double basic, double hra,
             double ta, double allowance) {
        super(id, name, basic, hra, ta, allowance);
    }

    double getBonus() {
        return (basic + hra) * 0.12;
    }
}

class Accountant extends Employee {
    Accountant(int id, String name, double basic, double hra,
               double ta, double allowance) {
        super(id, name, basic, hra, ta, allowance);
    }

    double getBonus() {
        return (basic + hra) * 0.08;
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager(100, "Rahul", 40000, 15000, 3000, 2000));
        employees.add(new Admin(101, "Amit", 35000, 10000, 2000, 1500));
        employees.add(new Engineer(102, "Priya", 45000, 12000, 3000, 2500));
        employees.add(new Accountant(103, "Neha", 30000, 8000, 2000, 1000));

        employees.sort(
                (e1, e2) -> Double.compare(e2.getBonus(), e1.getBonus())
        );

        for (Employee e : employees) {
            e.display();
        }
        System.out.println("----------------------------------");
    }
}