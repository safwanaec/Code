import java.util.Arrays;
import java.util.Scanner;
//Incomplete
public class B1895 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int[] ans = new int[t];
        int[][] arr= new int[t][];
        for(int i=0; i<t; i++){
            int n = inp.nextInt();
            arr[i]= new int[n];
            for(int j=0; j<n; j++){
                arr[i][j]=inp.nextInt();
            }
            Arrays.sort(arr[i]);
        }
        for(int i=0; i<t; i++){
            System.out.println(ans[i]);
            print(arr);
        }
        inp.close();
        for(int i=0; i<t; i++){
            print(arr);
        }
    }
    
    static int A1_A2(int a1, int a2) {
        return Math.abs(a1 - a2);
    }
    
    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = arr[i].length; j < arr[i].length / 2; j++, k--) {
                System.out.println(arr[i][j] + " " + arr[i][k]);
            }
        }
    }
}

