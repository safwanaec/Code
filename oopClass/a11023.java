import java.util.Scanner;

public class a11023 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum+i;
            System.out.print(i+"+");
        }

        System.out.println(sum);
        inp.close();
    }
}
