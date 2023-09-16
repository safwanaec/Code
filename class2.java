import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range=inp.nextInt();

        for(int i=0; i<range; i++){
            for(int j=range-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        inp.close();
    }
}
