public class a4 {
    public static void main(String[] args) {
        // Creating instances of Manager and Programmer
        Manager manager = new Manager("Safwan", "Senior Developer", 100000,40000);
        Programmer programmer = new Programmer("nigeta", "junior Developer", 10000,4000);

        // Calculating and displaying salaries
        System.out.println("Manager's salary: $" + manager.calculateSalary());
        System.out.println("Programmer's salary: $" + programmer.calculateSalary());
    }
}

// Parent class
class Employee {
    private String name;
    private String role;

    Employee(String name,String role){
        this.name = name;
        this.role = role;
    }
    public String getName(){
        return this.name;
    }
    public String getRole(){
        return this.role;
    }
    public double calculateSalary() {
        return 0.0; // Default implementation for base class
    }
}

// Subclass Manager
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name,String role,double baseSalary,double bonus) {
        super(name,role);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Override calculateSalary() for Manager
    @Override
    public double calculateSalary() {
        // Manager's salary includes base salary plus bonus
        return this.baseSalary + this.bonus;
    }
}

// Subclass Programmer
class Programmer extends Employee {
    private double baseSalary;
    private double overTimePay;

    public Programmer(String name,String role,double baseSalary,double overTimePay) {
        super(name,role);
        this.baseSalary = baseSalary;
        this.overTimePay = overTimePay;
    }

    // Override calculateSalary() for Programmer
    @Override
    public double calculateSalary() {
        // Manager's salary includes base salary plus bonus
        return this.baseSalary + this.overTimePay;
    }
}
