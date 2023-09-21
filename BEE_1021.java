import java.util.Scanner;

public class BEE_1021 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float money = inp.nextFloat();
        int moneyInt = (int)money;
        float moneyFloat = money - (int)money;

        System.out.println("NOTAS:");
        System.out.println((moneyInt-(moneyInt%100))/100+" nota(s) de R$ 100.00");
        moneyInt=moneyInt%100;
        System.out.println(((moneyInt-moneyInt%50)/50)+" nota(s) de R$ 50.00");
        moneyInt=moneyInt%50;
        System.out.println(((moneyInt-moneyInt%20)/20)+" nota(s) de R$ 20.00");
        moneyInt=moneyInt%20;
        System.out.println(((moneyInt-moneyInt%10)/10)+" nota(s) de R$ 10.00");
        moneyInt=moneyInt%10;
        System.out.println(((moneyInt-moneyInt%5)/5)+" nota(s) de R$ 5.00");
        moneyInt=moneyInt%5;
        System.out.println(((moneyInt-moneyInt%2)/2)+" nota(s) de R$ 2.00");
        moneyInt=moneyInt%2;

        moneyFloat=moneyFloat*100;
        System.out.println("MOEDAS:");
        System.out.println(moneyInt+" moeda(s) de R$ 1.00");
        System.out.println((int)((moneyFloat-moneyFloat%50)/50)+" moeda(s) de R$ 0.50");
        moneyFloat=moneyFloat%50;
        System.out.println((int)((moneyFloat-moneyFloat%25)/25)+" moeda(s) de R$ 0.25");
        moneyFloat=moneyFloat%25;
        System.out.println((int)((moneyFloat-moneyFloat%10)/10)+" moeda(s) de R$ 0.10");
        moneyFloat=moneyFloat%10;
        System.out.println((int)((moneyFloat-moneyFloat%5)/5)+" moeda(s) de R$ 0.05");
        moneyFloat=moneyFloat%5;
        System.out.println(Math.round(moneyFloat)+" moeda(s) de R$ 0.01");
        inp.close();
    }
}