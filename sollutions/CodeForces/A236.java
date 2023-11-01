import java.util.Scanner;
public class A236 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int count =0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) && s.charAt(i) !=' ' && s.charAt(j) !=' '){
                    count++;
                    s=s.replace(s.charAt(i),' ');
                    break;
                }
            }
        }
        s = s.replace(" ", "");;
        count +=s.length();
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else System.out.println("IGNORE HIM!");
        inp.close();
    }
}
