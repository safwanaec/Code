import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=inp.nextInt();
        inp.nextLine();
        a=0;
        String s = inp.nextLine();
        char[] S=s.toCharArray();

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)== s.charAt(i+1)){
                a++;
                S[i+1]=' ';
                s=new String(S);
                s=s.replace(" ", "");
                S=s.toCharArray();
                i--;
            }
        }
        System.out.println(a);
        inp.close();
    }
}
