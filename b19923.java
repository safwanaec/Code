import java.util.Scanner;

public class b19923 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        
        for(int i = 0; i<num; i++){
            for(int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                if(j==0){
                    System.out.print("+");
                }
                else System.out.print("-");
            }
            System.out.println("");
        }
        inp.close();
    }
}
