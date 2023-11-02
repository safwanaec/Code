import java.util.Scanner;
 
public class A116 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int ans=0;
        int maxans = 0;
        for(int i=0; i<x; i++){
            int exit = inp.nextInt();
            int enter = inp.nextInt();
            ans=ans+enter-exit;
            if(maxans<ans){
                maxans=ans;
            }
        }
        System.out.println(maxans);
        inp.close();
    }
}