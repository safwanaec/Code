import java.util.Scanner;

public class BEE_1018 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int money = inp.nextInt();
        System.out.println(money);

        System.out.println((money-(money%100))/100+" nota(s) de R$ 100,00");
        money=money%100;
        System.out.println(((money-money%50)/50)+" nota(s) de R$ 50,00");
        money=money%50;
        System.out.println(((money-money%20)/20)+" nota(s) de R$ 20,00");
        money=money%20;
        System.out.println(((money-money%10)/10)+" nota(s) de R$ 10,00");
        money=money%10;
        System.out.println(((money-money%5)/5)+" nota(s) de R$ 5,00");
        money=money%5;
        System.out.println(((money-money%2)/2)+" nota(s) de R$ 2,00");
        money=money%2;
        System.out.println(money+" nota(s) de R$ 1,00");

        inp.close();
    }
}
