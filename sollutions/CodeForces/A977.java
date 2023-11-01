import java.util.Scanner;

public class A977 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        int k=inp.nextInt();

        for(int i=0; i<k; i++){
            if(n%10==0){
                n=n/10;
            }
            else n=n-1;
        }
        System.out.println(n);
        inp.close();
    }
}
