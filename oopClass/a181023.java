import java.text.NumberFormat;

public class a181023 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.Name = "Alfaz Uddin";
        emp.Age = 69;
        emp.PhoneNumber = "01724228184";
        emp.Address = "Ishwardi,Pabna,Bangladesh";
        emp.Salary = 1;

        Manager man = new Manager();
        man.Name = "Safwan Abdullah";
        man.Age = 23;
        man.PhoneNumber = "01861249200";
        man.Address = "Matlab Uttar,chandpur,Bangladesh";
        man.Salary = 10000000;

        man.printSalary();
        emp.printSalary();
    }
}

class member {
    String Name;
    int Age;
    String PhoneNumber;
    String Address;
    int Salary;

    public void printSalary() {
        System.out.println("");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Address: " + Address);
        NumberFormat format = NumberFormat.getCurrencyInstance();
        System.out.println("Salary: " + format.format(Salary));
        System.out.println("");
    }
}

class Employee extends member {
    String specialization;
    String department;

}

class Manager extends member {
    String specialization;
    String department;
}
