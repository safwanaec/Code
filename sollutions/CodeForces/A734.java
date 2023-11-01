import java.util.Scanner;

public class A734 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.nextInt();
        inp.nextLine();
        String s= inp.nextLine();
        int A=0,D=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                A++;
            }
            else D++;
        }
        if(A>D){
            System.out.println("Anton");
        }
        else if(D>A){
            System.out.println("Danik");
        } 
        else System.out.println("Friendship");
        inp.close();
    }
}
