/**
 * quineMcClansky
 **/
import java.util.Scanner;
public class quineMcClansky {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("How many inputs do you have?");
        int n = inp.nextInt();
        System.out.println("How many values of m would you like to enter:");
        int mCounter=inp.nextInt();
        int[] m = new int[mCounter];
        System.out.println("Enter the values of m");
        for(int i=0; i<mCounter; i++){
            m[i]=inp.nextInt();
        }

    }
}