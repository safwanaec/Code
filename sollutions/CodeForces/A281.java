//package CodeForces;

import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int a = s.charAt(0);
        if(a>96){
            a-=32;
        }
        char[] c=s.toCharArray();
        c[0]=(char) a;
        System.out.println(c);
        inp.close();
    }
}
