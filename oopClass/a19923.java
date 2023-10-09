import java.util.Scanner;

public class a19923 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the amount of nums you want to enter: ");
        final int range = inp.nextInt();
        int[] num;
        num = new int[range];

        System.out.println("Enter the nums:");
        for(int i = 0; i<range; i++){
            num[i]=inp.nextInt();
        }

        int sum=0, mul=1;

        for(int i = 0; i<range; i++){
            sum=sum+num[i];
            mul*=num[i];
        }
        System.out.println("Total sum: "+sum+"\nTotal multiplication: "+mul);

        inp.close();
    }
}
