import java.util.Scanner;

public class A546 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        int n =inp.nextInt();
        int w = inp.nextInt();
        for(int i=0; i<w; i++){
            n=n-(k*(i+1));
        }
        if(n<0){
            n=-n;
            System.out.println(n);
        }
        else System.out.println(0);
        
        inp.close();
    }
}
