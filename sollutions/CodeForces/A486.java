import java.util.Scanner;

public class A486 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long n = inp.nextLong();
        if(n%2==0){
            n=n/2;
        }
        else{
            n=(-(++n)/2);
        }
        System.out.println(n);
        inp.close();
    }
}
