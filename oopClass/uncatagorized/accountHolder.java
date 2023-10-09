import java.util.Scanner;

public class accountHolder {
    public static void main(String[] args) {
        bankAccountTemplate bankAccount1 = new bankAccountTemplate();
         bankAccount1.setValue(100273836246l, "Safwan", 100000);
       
        bankAccount1.bankAccount();
        System.out.println("\n\nTo Deposit money enter 1\n\nTo Withdraw money enter 2");
        Scanner inp = new Scanner(System.in);
        System.out.print("Choose: ");
        byte choice = inp.nextByte();

        if (choice==1){
            bankAccount1.depositMoney();
        }
        else if(choice==2){
            bankAccount1.withdrawMoney();
        }
        else{System.out.println("WRONG CHOICE!!");}
        //System.out.println("\n\n");
        bankAccount1.bankAccount();
        inp.close();
    }
}
