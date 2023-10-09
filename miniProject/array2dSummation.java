import java.util.Scanner;

public class array2dSummation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("\nEnter the amount of rows in the matrix: ");
        int rows = inp.nextInt();
        System.out.print("\nEnter the amount of columns in the matrix: ");
        int cols = inp.nextInt();
        int[][] num;
        num = new int[rows][cols];

        System.out.println("\nEnter the nums:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                num[i][j]=inp.nextInt();
            }
        }

        System.out.println("\nThe matrix is:");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }

        int sumRow,sumCol,mulRow,mulCol;

        for(int i = 0; i<rows; i++){
            sumRow=0;
            mulRow=1;
            for(int j = 0; j<cols; j++){
                sumRow+=num[i][j];
                mulRow*=num[i][j];
            }
            System.out.println("\nSummation of Row "+(i+1)+" = "+sumRow);
            System.out.println("\nMultiplication of Row "+(i+1)+" = "+mulRow);
        }
        for(int i = 0; i<cols; i++){
            sumCol=0;
            mulCol=1;
            for(int j = 0; j<rows; j++){
                sumCol+=num[j][i];
                mulCol*=num[j][i];
            }
            System.out.println("\nSummation of Column "+(i+1)+" = "+sumCol);
            System.out.println("\nMultiplication of Column "+(i+1)+" = "+mulCol);
        }

        inp.close();
    }
}
