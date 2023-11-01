import java.util.Scanner;

public class A791 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int ans = 0;
        while(a<=b){
            ans++;
            a*=3;
            b*=2;
        }
        System.out.println(ans);
        inp.close();
    }
}
