import java.util.Scanner;

public class A271 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        n++;
        int a=(n%10);
        int b=((int)(n/10)%10);
        int c=((int)(n/100)%10);
        int d=((int)(n/1000)%10);
        while(true){
            if(a-b!=0 && a-c!=0 &&a-d!=0 && b-c!=0 && b-d!=0 && c-d!=0){
                break;
            }
            n++;
            a=(n%10);
            b=((n/10)%10);
            c=((n/100)%10);
            d=((n/1000)%10);
        }
        System.out.println(n);
        inp.close();
    }
}
