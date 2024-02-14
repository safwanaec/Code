import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("The largest numberis:" + max);
        System.out.println("The lowest number is:" + min);
        sc.close();

    }

}