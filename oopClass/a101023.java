import java.util.Scanner;

public class a101023 {
    /*
     * Create a class called 'Matrix' containing constructor that initializes the
     * number of rows and number of columns of a new Matrix object. The Matrix class
     * has the following information:1.number of rows of matrix2 number of columns
     * of matrix3 - elements of matrix in the form of 2D array
     */
    
    public static void main(String[] args) {
        Matrix mat = new Matrix(3,3);
        Scanner inp = new Scanner(System.in);
        mat.m=3;
        mat.n=3;
        mat.getValue(mat.matrix,inp);
        mat.printMatrix(mat.matrix);

        System.out.println("For Matrix 1: ");
        mat.getValue(mat.matrix1,inp);
        System.out.println("For Matrix 2: ");
        mat.getValue(mat.matrix2,inp);

        mat.printMatrix(mat.addMatrix(mat.matrix1, mat.matrix2));

    }
}
class Matrix{
    int m; 
    int n;
    Matrix(int row, int col){
        m=row; 
        n=col;
    }
    
    int[][]matrix = new int[3][3];
    int[][]matrix1 = new int[3][3];
    int[][]matrix2 = new int[3][3];

    void getValue(int mat[][],Scanner inp){
        System.out.println("Enter The elements of the matrix:");
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=inp.nextInt();
            }
            
        }
    }
    void printMatrix(int mat[][]){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
    int[][] addMatrix(int mat1[][], int mat2[][]){
        int[][] sum = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }
}
