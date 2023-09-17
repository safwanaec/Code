import java.text.DecimalFormat;
import java.util.Scanner;
public class BEE_1009 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        String name = inp.nextLine();
        double salary = inp.nextDouble();
        double amountInSales = inp.nextDouble();
        double bonus = amountInSales*0.15;
        double Total = salary+bonus;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("TOTAL = R$ "+df.format(Total));
        inp.close();
        name = null;
    }
}
