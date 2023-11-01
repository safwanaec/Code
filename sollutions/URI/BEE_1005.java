import java.util.Scanner;

public class BEE_1005 {
    public static void main(String[] args) {
        final double weightA=3.5;
        final double weightB=7.5;

        Scanner inp = new Scanner(System.in);
        Double A = inp.nextDouble();
        Double B = inp.nextDouble();

        Double WeightedAvarage = (A*weightA+B*weightB)/(weightA+weightB);
        System.out.printf("MEDIA = %.5f\n", WeightedAvarage);
        inp.close();
    }
}
