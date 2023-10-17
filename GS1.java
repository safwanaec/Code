import java.util.Scanner;

public class GS1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int i =inp.nextInt();
        System.out.println("Enter name: ");
        inp.nextLine();
        String j =inp.nextLine();
        System.out.println("Number: "+i);
        System.out.println("name: "+j);


    }
}