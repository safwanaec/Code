import java.util.Scanner;

public class a20923 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println("");

        }

    }
}
