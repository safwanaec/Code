package Others;

import java.util.Scanner;

public class tempTest1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int m1=inp.nextInt();
        int n1=inp.nextInt();
        int m2=inp.nextInt();
        int n2=inp.nextInt();
        int[][] matrix1 = new int [m1][n1];
        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                matrix1[i][j]=inp.nextInt();
            }
        }
        int[][] matrix2 = new int [m2][n2];
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                matrix2[i][j]=inp.nextInt();
            }
        }
        int[][] ansMatrix = new int[m1][n2];
        int ans;
        for(int i=0; i<m1; i++){
            for(int j=0; j<n2; j++){
                ans=0;
                for(int k=0; k<n1; k++){
                    ans = ans + matrix1[i][k]*matrix2[k][j];
                }
                ansMatrix[i][j]=ans;
            }
        }
        inp.close();
    }
}
