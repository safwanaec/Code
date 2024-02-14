public class student2 {
    String name;
    String city;
    int age;
    
    public static void main(String[] args) {
        student1 s1 = new student1();
        student1 s2 = new student1();
        s1.age=99;
        s1.city="dhaka";
        s1.name="Safwan";
        s2.age=12;
        s2.city="Selhet";
        s2.name="Moon";
        s1.printData();
        s2.printData();
    }
    public void getData(String Name, String City, int Age){
        name = Name;
        city = City;
        age = Age;
    }
    public void printData(){
        System.out.println("Name: "+this.name);
        System.out.println("City: "+this.city);
        System.out.println("Age: "+this.age);
    }
    
}
