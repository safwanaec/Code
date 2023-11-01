import java.util.Scanner;

public class A110 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        long x=inp.nextLong();
        long devider=10;
        int count =0;
        while(x>0){
            if(x%10==4 || x%10==7){
                count++;
                x=x/devider;
            }
            else {
                x=x/devider;
            }
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else System.out.println("NO");
        inp.close();
    }
}
