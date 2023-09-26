import java.text.NumberFormat;

public class bankAccountTemplate {
    long accountNumber;
    String accountHolderName;
    int depositedMoney;

    /*void setValue(long a,String n,int m)
    {
        accountNumber= a;
        accountHolderName= n;
        depositedMoney=m;

    }*/

    void bankAccount(){
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Account number:"+accountNumber);
        System.out.println("Account holder name:"+accountHolderName);
        System.out.println("Account balance:"+money.format(depositedMoney));
    }
}
