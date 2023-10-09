import java.util.Scanner;

public class BEE_1020 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int inputAgeInDays = inp.nextInt();

        byte year=0;
        byte month=0;
        byte day=0;

        year = (byte)(inputAgeInDays/365);
        inputAgeInDays = inputAgeInDays%365;

        month = (byte)(inputAgeInDays/30);
        inputAgeInDays = inputAgeInDays%30;
        day = (byte)inputAgeInDays;

        System.out.println(year +" ano(s)\n" + month +" mes(es)\n" + day +" dia(s)");

        inp.close();
    }
}
