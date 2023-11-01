
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int Range = inp.nextInt();
        System.out.print("\n");
        for(int i=1; i<=Range; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int i=1; i<=Range; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        
        for(int i=1; i<=Range; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        inp.close();
    }
}
