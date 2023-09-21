import java.util.Scanner;

public class a19923 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the amount of nums you want to enter: ");
        int range = inp.nextInt();
        int[] num;
        num = new int[range];

        System.out.println("Enter the nums:");
        for(int i = 0; i<range; i++){
            num[i]=inp.nextInt();
        }

        int sum=0;

        for(int i = 0; i<range; i++){
            sum=sum+num[i];
        }
        System.out.println("Total sum: "+sum);

        inp.close();
    }
}
