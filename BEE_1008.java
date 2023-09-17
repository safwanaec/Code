import java.util.Scanner;

public class BEE_1008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int workHours = inp.nextInt();
        float payPerHour = inp.nextFloat();

        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = U$ %.2f\n",(workHours*payPerHour));
        inp.close();
    }
}
