
import java.util.Scanner;

public class sumon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum =  0;
        for(int i=0; i<6; i++){
            if(num==0){break;}
            sum = sum + (num % 10);
            num = num/10;
        }
        System.out.println("Sum of the digits:= " + sum);
    }
}
