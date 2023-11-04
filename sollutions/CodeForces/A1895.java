import java.util.Scanner;

public class A1895 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int[] ans=new int[t];
        for(int i=0; i<t; i++){
            int x = inp.nextInt();
            int y = inp.nextInt();
            int k = inp.nextInt();
            for(int j=0; j<Math.max(x,y); j++){
                if(x>=y){
                    ans[i]=x;
                    continue;
                }
                else{
                    if(x+k >=y){
                        ans[i]=y;
                        continue;
                    }
                    else{
                        ans[i]= ((y -(x+k))*2)+(x+k);
                        continue;
                    }
                }
            }
        }
        for(int i:ans ){
               System.out.println(i); 
        }
        inp.close();
    }
}
