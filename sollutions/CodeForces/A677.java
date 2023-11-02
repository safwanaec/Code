import java.util.Scanner;

public class A677 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int h = inp.nextInt();
        int ans = 0;
        for(int i=0; i<n; i++){
            int fndh=inp.nextInt();
            if(fndh>h){
                ans++;
                ans++;
            }
            else ans++;
        }
        System.out.println(ans);
        inp.close();
    }
}
