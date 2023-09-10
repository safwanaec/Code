import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\n\nEnter marks between 1-100: ");
        byte i = inp.nextByte();

        if(i<=100 && i>=80){
            System.out.println("\nA+");
        }
        else if(i<=79 && i>=70){
            System.out.println("\nA");
        }
        else if(i<=69 && i>=60){
            System.out.println("\nA-");
        }
        else if(i<=59 && i>=50){
            System.out.println("\nB");
        }
        else if(i<=49 && i>=40){
            System.out.println("\nC");
        }
        else if(i<=39 && i>=33){
            System.out.println("\nD");
        }
        else if(i<=32 && i>=0){
            System.out.println("\nF");
        }
        else{
            System.out.println("\nWrong input!");
        }
        inp.close();
    }
}
