public class Ans1 {
    public static void main(String[] args) {
        System.out.println(new employe("Safwan0", 999999.0));

        System.out.println(new Manager("Safwan1", 99999.0, "Data Analyticsx"));

        System.out.println(new Executive("Safwan2", 99999.99, "Data Analytics"));

    }
}



class employe{
    String name;
    Double salary;

    employe(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Name: "+name + "Salary: " + salary;
    }
}

class Manager extends employe{
    String Depertment;

    Manager(String name, Double salary, String Depertment){
        super(name, salary);
        this.Depertment = Depertment;
    }

    @Override
    public String toString() {
        return "Name: "+name + "Salary: " + salary + "Depertment: " + Depertment;
    }
}

class Executive extends Manager{
    Executive(String name, Double salary, String Depertment){
        super(name, salary, Depertment);
    }
}