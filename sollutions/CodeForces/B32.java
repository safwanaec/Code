import java.util.Scanner;

public class B32 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
        String ans="";
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i)=='.'){
                ans+="0";
            }
            else if(n.charAt(i)=='-' && n.charAt(i+1)=='.' && i<n.length()-1){
                ans+="1";
                i++;
            }
            else if(n.charAt(i)=='-' && n.charAt(i+1)=='-' && i<n.length()-1){
                ans+="2";
                i++;
            }
        }
        System.out.println(ans);
        inp.close();
    }
}
