import java.util.Scanner;

public class BEE_1003 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sum1 = inp.nextInt();
        int sum2 = inp.nextInt();

        System.out.println("SOMA = "+ (sum1+sum2));
        inp.close();
    }
}