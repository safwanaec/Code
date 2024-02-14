import java.util.*;

public class one {
    public static void main(String[] args) 
    {
        int n;
        Scanner in = new Scanner(System.in);
        n=3;// in.nextInt();
        int i;
        in.close();
        double sum=0;
        for(i=1;i<=n;i++)
        {
            System.out.print(Math.pow(i,3));
            sum = (int) (sum + Math.pow(i,3));
            
        }
        System.out.println();
        System.out.println(sum);

        System.out.println((double)4000/(4*4000));
        int x=1;
        int count=0;
        int y=x;
        System.out.println("x%2 "+x%2+" x%2!=0"+(x%2!=0));
        for(int j=1; j<=x; j++){
            if(j%2!=0){
                y=y-j;
                System.out.println("y"+y);
                if(y>0){
                    count++;
                }
                else if(y==0){
                    count++;
                    break;
                }
                else{
                    break;
                }
                
            }
        }
        System.out.println("count"+count);
    }
}
   
    

