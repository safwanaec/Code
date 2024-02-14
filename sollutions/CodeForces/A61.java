import java.util.Scanner;

public class A61 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a=inp.nextLine();
        String b=inp.nextLine();
        String ans = "";

        for(int i=0; i<a.length(); i++){
            Character.compare(a.charAt(i),b.charAt(i));
        }
        inp.close();
    }
}
