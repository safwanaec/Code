import java.util.*;

public class one {
    public static void main(String[] args) 
    {
        int n;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        int i;
        double sum=0;
        for(i=1;i<=n;i++)
        {
            System.out.print(Math.pow(i,3));
            sum = (int) (sum + Math.pow(i,3));
            
        }
        System.out.println();
        System.out.println(sum);
        in.close();
        
    }
   
    
}
