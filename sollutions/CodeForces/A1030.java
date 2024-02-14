import java.util.Scanner;

public class A1030 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x=inp.nextInt();
        boolean y=false;
        for(int i=0; i<x; i++){
            byte a= inp.nextByte();
            if(a==1){
                y=true;
            }
        }
        if(y){
            System.out.println("HARD");
        }
        else System.out.println("EASY");
        inp.close();
    }
}
