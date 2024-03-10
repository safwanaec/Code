import java.util.Scanner;
public class A236 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int count=0;
        
        while(s.length()>0){
            count++;
            s = s.replace(s.charAt(0), ' ');
            s = s.replace(" ", "");
        }
        System.out.println(count);
        if((count)%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else System.out.println("IGNORE HIM!");
        inp.close();
    }
}
