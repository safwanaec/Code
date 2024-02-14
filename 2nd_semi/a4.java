public class a4 {
    public static void main(String[] args) {
        // Creating instances of Manager and Programmer
        Manager manager = new Manager(5000);
        Programmer programmer = new Programmer(4000);

        // Calculating and displaying salaries
        System.out.println("Manager's salary: $" + manager.calculateSalary());
        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
    }
}

// Parent class
class Employee {
    public double calculateSalary() {
        return 0.0; // Default implementation for base class
    }
}

// Subclass Manager
class Manager extends Employee {
    private double baseSalary;

    public Manager(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Override calculateSalary() for Manager
    @Override
    public double calculateSalary() {
        // Manager's salary includes base salary plus bonus
        double bonus = 0.1 * baseSalary; // 10% of base salary
        return baseSalary + bonus;
    }
}

// Subclass Programmer
class Programmer extends Employee {
    private double monthlySalary;

    public Programmer(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Override calculateSalary() for Programmer
    @Override
    public double calculateSalary() {
        // Programmer's salary is based on monthly salary
        return monthlySalary;
    }
}
