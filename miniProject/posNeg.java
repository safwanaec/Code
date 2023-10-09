import java.util.Scanner;

public class posNeg 
{

    public static void main(String[] args) 
    {
        int A = 60;
        
        if(A>0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negetive\n");
        }

        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();

        
        double hight = input.nextDouble();

        System.out.println(0.5*base*hight);
        input.close();

    }
}