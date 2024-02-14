import java.util.Scanner;

public class A467 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        byte n = inp.nextByte();
        byte ans=0;
        
        for(byte i=0; i<n; i++){
            byte x = inp.nextByte();
            byte y = inp.nextByte();
            y--;
            if(x<y){
                ans++;
            }
        }
        System.out.println(ans);
        inp.close();
    }
}
