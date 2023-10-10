package uncatagorized;
import java.text.NumberFormat;
import java.util.Scanner;

public class bankAccountTemplate {
    long accountNumber;
    String accountHolderName;
    int Money;

    void setValue(long a,String n,int m)
    {
        accountNumber= a;
        accountHolderName= n;
        Money=m;

    }

    void bankAccount(){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("\n\nAccount number:"+accountNumber);
        System.out.println("Account holder name:"+accountHolderName);
        System.out.println("Account balance:"+money.format(Money));
    }

    void depositMoney(){
        System.out.print("Enter the amount of money you want to deposit: ");
        Scanner inp = new Scanner(System.in);
        int depositMoney= inp.nextInt();
        Money=Money+depositMoney;
        inp.close();
    }

    void withdrawMoney(){
        System.out.print("Enter the amount of money you want to withdraw: ");
        Scanner inp = new Scanner(System.in);
        int withdrawMoney= inp.nextInt();
        Money=Money-withdrawMoney;
        inp.close();
    }

}
