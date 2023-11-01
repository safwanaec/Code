
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int capital;
        float anualInterest, monthlyInterest, time;

        while(true){
            System.out.print("Please enter Capital amount: ");
            capital = inp.nextInt();
            if(capital>1000000 || capital<1000){
                System.out.println("Please enter amount between 1K$ and 1M$");
            }
            else break;
        }

        while(true){
            System.out.print("\nPlease enter rate of interest: ");
            anualInterest = inp.nextFloat();
            if(anualInterest>30 || anualInterest<=0){
                System.out.println("Please enter interest between 0 to 30 percent");
            }
            else break;
        }
        
        monthlyInterest = anualInterest/1200;

        while(true){
            System.out.print("\nPlease enter time in years: ");
            time = inp.nextFloat();
            if(time>30 || time<=0){
                System.out.println("Please enter time between 0 to 30 years");
            }
            else break;
        }

        float mortgage = (((float)capital*monthlyInterest*(float)Math.pow(1+monthlyInterest,time*12))/((float)Math.pow(1+monthlyInterest,time*12)-1.0F));

        NumberFormat change = NumberFormat.getCurrencyInstance();
        System.out.print("\nYour mortgage is " + change.format(mortgage));
        inp.close();
    }
    
}
