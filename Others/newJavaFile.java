import java.util.Scanner;
public class newJavaFile {
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      int range;
        System.out.println("Enter any numeber");
        range=input.nextInt();
        for(int i=0; i<=range; i++){
            for(int j=0; j<range-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        input.close();
    }
}
