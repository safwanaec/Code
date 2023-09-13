import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter Capital amount: ");
        int capital = inp.nextInt();
        System.out.print("\nPlease enter rate of interest: ");
        float anualInterest = inp.nextFloat();
        float monthlyInterest = anualInterest/1200;
        System.out.print("\nPlease enter time in years: ");
        float time = inp.nextFloat();

        float mortgage = (((float)capital*monthlyInterest*(float)Math.pow(1+monthlyInterest,time*12))/((float)Math.pow(1+monthlyInterest,time*12)-1.0F));

        NumberFormat change = NumberFormat.getCurrencyInstance();
        System.out.print("\nYour mortgage is " + change.format(mortgage));
        inp.close();
    }
    
}
