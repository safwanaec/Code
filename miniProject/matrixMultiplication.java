import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        System.out.println("Enter the index of the 1st matrix in(m*n)format:");
        System.out.print("m = ");

        Scanner inp = new Scanner(System.in);

        int m1=inp.nextInt();
        System.out.print("n = ");
        int n1=inp.nextInt();

        int[][] matrix1 = new int [m1][n1];

        System.out.println("Enter the elements of the 1st matrix:");

        for(int i=0; i<m1; i++){
            for(int j=0; j<n1; j++){
                matrix1[i][j]=inp.nextInt();
            }
        }
        System.out.println("Enter the index of the 2nd matrix in(m*n)format:");

        System.out.print("m = ");
        int m2=inp.nextInt();

        System.out.print("n = ");
        int n2=inp.nextInt();

        int[][] matrix2 = new int [m2][n2];

        System.out.println("Enter the elements of the 2nd matrix:");
        for(int i=0; i<m2; i++){
            for(int j=0; j<n2; j++){
                matrix2[i][j]=inp.nextInt();
            }
        }

        int[][] ansMatrix = new int[m1][n2];
        int ans;

        if(n1==m2){
            for(int i=0; i<m1; i++){
                for(int j=0; j<n2; j++){
                    ans=0;
                     

                    for(int k=0; k<n1; k++){
                        ans = ans + matrix1[i][k]*matrix2[k][j];
                    }
                    ansMatrix[i][j]=ans;
                }
            }
            
                System.out.println("Matrix_1 * Matrix_2 =");
            for(int i=0; i<m1; i++){
                for(int j=0; j<n1; j++){
                    System.out.print(matrix1[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("\nmultiplied by\n");
            for(int i=0; i<m2; i++){
                    for(int j=0; j<n2; j++){
                    System.out.print(matrix2[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("\nEqual to\n");
            for(int i=0; i<m2; i++){
                    for(int j=0; j<n1; j++){
                    System.out.print(ansMatrix[i][j]+"\t");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("The matrix can't be multiplied.");
        }
        inp.close();
    }
}
