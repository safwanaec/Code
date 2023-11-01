import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s=inp.nextLine();
        int C=0;
        int c=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<97){
                C++;
            }
            else c++;
        }
        if(C>c){
            s=s.toUpperCase();
        }
        else s=s.toLowerCase();
        System.out.println(s);
        inp.close();
    }
}
