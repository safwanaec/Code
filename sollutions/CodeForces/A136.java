import java.util.Scanner;

public class A136 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        byte n = inp.nextByte();
        int x=0;
        int[] out=new int[n];
        for(byte i=0; i<n; i++){
            x=inp.nextInt();
            x--;
            out[x]=i+1;
        }
        for(byte i=0; i<n; i++){
            System.out.print(out[i]+" ");
        }
        inp.close();
    }
}
