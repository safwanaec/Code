 import java.util.*;  
   public class testa {

    int a;
    int b;
    public void sum1(){
        System.out.println(a+b);
    }
    public void sum2(int A, int B){

        a = A;
        b = B;
        System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        testa s1 = new testa();

        s1.a=sc.nextInt();
        s1.b=sc.nextInt();
        s1.sum1();

        int x = sc.nextInt();
        int y =sc.nextInt();

        s1.sum2(x, y);
        

    }
}
