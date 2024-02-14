import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        try {

            if (i < 18) {
                throw new ArithmeticException("Azad MC");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}