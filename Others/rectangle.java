import java.util.Scanner;

class shape{
    public int getArea(int length, int weidth){
        return length*weidth;
    }
}
public class rectangle extends shape{
    public static void main(String args[]){
        shape rc = new shape();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Hight and Wedth of the Rectangle: ");
        System.out.println("the area is " + rc.getArea(inp.nextInt(), inp.nextInt()));
        inp.close();
    }
}
