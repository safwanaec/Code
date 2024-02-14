import java.util.Scanner;

public class A344 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int ans=0;
        boolean isTen=false;
        boolean isOne=false;
        for(int i=0; i<n; i++){
            byte x = inp.nextByte();
            if(x==10 && !isTen){
                ans++;
                isTen=true;
                isOne=false;
            }
            else if(x==1 && !isOne){
                ans++;
                isTen=false;
                isOne=true;
            }

        }
        System.out.println(ans);
        inp.close();
    }
}
