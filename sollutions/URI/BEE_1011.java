import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_1011 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner inp = new Scanner(System.in);
        double radius = inp.nextDouble();
        
        DecimalFormat formatter = new DecimalFormat("0.000");

        double volume = (4.0/3.0)*pi*Math.pow(radius, 3);
        System.out.println("VOLUME = "+formatter.format(volume));

        inp.close();
    }
}
