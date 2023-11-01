package Others;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        System.out.println("Enter range: ");
        Scanner inp = new Scanner(System.in);
        int range = inp.nextInt();

        for(int i=0; i<=(range/2); i++){
            for(int j=0; j<(range/2)-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=(range/2); i>=0; i--){
            for(int j=(range/2)-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<(i-1)*2+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        inp.close();
    }
}
