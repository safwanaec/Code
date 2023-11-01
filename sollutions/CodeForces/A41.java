import java.util.Scanner;

public class A41 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String a =inp.nextLine();
        String b=inp.nextLine();
        if (b.equals(reverse(a))) {
            System.out.println("YES");
        }
        else System.out.println("NO");
        inp.close();
    }
    static String reverse(String string){
        char[] x=string.toCharArray();
        char[] ans=new char[x.length];
        for(int i=string.length()-1,y=0; i>=0; i--,y++){
            ans[y]=x[i];
        }
        return new String(ans);
    }
}
