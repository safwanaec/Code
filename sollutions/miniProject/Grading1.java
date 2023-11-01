import java.util.Scanner;
public class Grading1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\n\nEnter marks between 1-100: ");
        int i = inp.nextInt();
        i = i/10;

        switch(i){
            case 0: System.out.println("\nF");
                break;
            case 1: System.out.println("\nF");
                break;
            case 2: System.out.println("\nF");
                break;
            case 3: System.out.println("\nD");
                break;
            case 4: System.out.println("\nC");
                break;
            case 5: System.out.println("\nB");
                break;
            case 6: System.out.println("\nA");
                break;
            case 7: System.out.println("\nA-");
                break;
            case 8: System.out.println("\nA+");
                break;
            case 9: System.out.println("\nA+");
                break;
            case 10: System.out.println("\nA+");
                break;
            default: System.out.println("\nError!!");
        }
        inp.close();
    }
}
