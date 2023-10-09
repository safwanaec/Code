import java.util.Scanner;

public class a25923 {

 int x = 5;
 int age = 20;
 String name;
 public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     
     
    a25923 myObj = new a25923();
    a25923 jahidTheHero = new a25923();
    jahidTheHero.name = sc.nextLine();
    System.out.println(myObj.x);
    System.out.println(myObj.age);
    System.out.println(jahidTheHero.name);
    sc.close();
 }
}