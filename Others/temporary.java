package Others;

import java.util.Scanner;

public class temporary {
    public static void main(String[] args) {
        int[] a;
        a = new int[3];

        Scanner inp = new Scanner(System.in);

        for(int i=0; i<3; i++){
            a[i]=inp.nextInt();
        }

        System.out.println(a[0]+a[1]+" "+a[2]);
        inp.close();
    }
}
