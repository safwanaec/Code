import java.util.Scanner;

public class BEE_1013 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int temp;
        if(b>a){
            temp=a;
            a=b;
            b=temp;
        }
        if(c>a){
            temp=a;
            a=c;
            c=temp;
        }
        System.out.println(a+" eh o maior");
        inp.close();
    }
}
