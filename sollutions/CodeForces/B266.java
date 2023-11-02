import java.util.Scanner;

public class B266 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int t = inp.nextInt();
        inp.nextLine();
        String s = inp.nextLine();
        char[]c=s.toCharArray();

        for(int i=0; i<t; i++){
            for(int j=0; j<n-1; j++){
                if(c[j]=='B' && c[j+1]=='G'){
                    c[j]='G';
                    c[j+1]='B';
                    j++;
                }
            }
        }
        System.out.println(c);
        inp.close();
    }
}
