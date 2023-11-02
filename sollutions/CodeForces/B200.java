import java.util.Scanner;

public class B200 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double total=0;
        for(int i=0; i<n; i++){
            float item = inp.nextFloat();
            total+=item;
            if(i==n-1){
                System.out.printf("%.12f",total/n);
            }
        }
        inp.close();
    }
}
