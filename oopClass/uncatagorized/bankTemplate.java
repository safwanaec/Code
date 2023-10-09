public class bankTemplate {
    String accountname;
    long money;
    long accountNumber;
    int serial;

    void setValue(int s,String n, long ac, long m)
    {
        accountname = n;
        money =m;
        accountNumber = ac;
        serial = s;

    }
    void display()
    {
         System.out.println("Account serial = "+serial);
        System.out.println("Account number = "+accountNumber);
        System.out.println("Account name = "+accountname);
        System.out.println("Account's money = "+money);
        System.out.println();
    }
    void deposit(int money)
    {
        int updated_money=0;
        updated_money = updated_money+ money;

    }
    void withdraw()
    {

    }


    
}
