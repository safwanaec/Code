import java.util.Scanner;

public class A104767 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System .in);
        int x =inp.nextInt();
        inp.nextLine();
        String a = inp.nextLine();
        char[] A=a.toCharArray();
        char [] ans= new char[x*3];
        int Ans=0;
        int index_of_ans=0;
        for(int i=0; i<A.length; i++){
            if(i<A.length-1 && A[i]=='(' && A[i+1]=='('){
                ans[index_of_ans]='(';
                index_of_ans++;
                ans[index_of_ans]='(';
                index_of_ans++;
                i++;
                continue;
            }

            if(i>0 && A[i-1]==')' && A[i]==')'){
                ans[index_of_ans]='+';
                index_of_ans++;
                ans[index_of_ans]='1';
                index_of_ans++;
            }

            if(i<A.length-1 && A[i]==')' && A[i+1]=='(' ){
                ans[index_of_ans]=')';
                index_of_ans++;
                ans[index_of_ans]='*';
                index_of_ans++;
                ans[index_of_ans]='(';
                index_of_ans++;
                i++;
                continue;
            }

            if(i<A.length-1 && A[i]==')' && A[i+1]==')'){
                ans[index_of_ans]=')';
                index_of_ans++;
                ans[index_of_ans]='+';
                index_of_ans++;
                ans[index_of_ans]='1';
                index_of_ans++;
                ans[index_of_ans]=')';
                index_of_ans++;
                i++;
                continue;
            }

            if(i<A.length-1 && A[i]=='(' && A[i+1]==')' ){
                ans[index_of_ans]='(';
                index_of_ans++;
                ans[index_of_ans]='1';
                index_of_ans++;
                ans[index_of_ans]=')';
                index_of_ans++;
                i++;
                continue;
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]);
            boolean point =false;
            if(ans[i]=='+' && ans[i+1]=='1'){
                Ans++;
                point = true;
            }
        }
    }
}