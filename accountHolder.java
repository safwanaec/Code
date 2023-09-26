import java.text.NumberFormat;

public class accountHolder {
    public static void main(String[] args) {
        bankAccountTemplate bankAccount1 = new bankAccountTemplate();
        bankAccount1.accountNumber=10029876545673L;
        bankAccount1.accountHolderName="Safwan";
        bankAccount1.depositedMoney=999999999;
        //bankAccount1.setValue(122737373773737L, "Safwan", 100000);
        bankAccount1.bankAccount();
        /*NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Account number:"+bankAccount1.accountNumber);
        System.out.println("Account holder name:"+bankAccount1.accountHolderName);
        System.out.println("Account balance:"+money.format(bankAccount1.depositedMoney));*/

    }
}
