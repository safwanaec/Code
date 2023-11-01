package Others;

import java.text.NumberFormat;
import java.util.Scanner;

public class interest {
    public double futureInvestmentValue(double interestRate, int numberOfYears, int capitalAmount){
        double capitalWithInterest;
        capitalWithInterest=capitalAmount+(capitalAmount*interestRate*numberOfYears)/100;

        return capitalWithInterest;
    }

    public String moneyformat(double money){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(money);
    }

    public static void main(String[] args) {
        System.out.println("Enter interest rate, number of years and capital amount respectively: ");

        interest in = new interest();
        Scanner inp = new Scanner(System.in);
        System.out.println(in.moneyformat(in.futureInvestmentValue(inp.nextDouble(), inp.nextInt(), inp.nextInt())));
        inp.close();
    }
}
