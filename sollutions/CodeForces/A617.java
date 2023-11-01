import java.util.Scanner;

public class A617 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x =inp.nextInt();
        int ans=0;
        while(x!=0){
            if(x<6){
                x=x-x;
            }
            else x=x-5;
            ans++;
        }
        System.out.println(ans);
        inp.close();
    }
}
