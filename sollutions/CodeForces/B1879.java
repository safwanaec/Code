import java.util.Scanner;

public class B1879 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n = 0;
        long[] ans = new long[t];
        long minA = Long.MAX_VALUE;
        long minB = Long.MAX_VALUE;
        for(int i=0; i<t; i++){
            minA = Long.MAX_VALUE;
            minB = Long.MAX_VALUE;
            n=inp.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for(int j=0; j<n; j++){
                a[j]=inp.nextInt();
                if(minA>a[j]){
                    minA = a[j];
                }
            }
            for(int j=0; j<n; j++){
                b[j]=inp.nextInt();
                if(minB>b[j]){
                    minB = b[j];
                }
            }
            ans[i]=Math.min(Math.addExact(arraysum(a), (minB*n)), Math.addExact(arraysum(b), (minA*n)));
            if(ans[i]<0L){
                ans[i]=Long.MAX_VALUE;
            }
        }
        for(int i=0; i<t; i++){
            System.out.println(ans[i]);
        }
        inp.close();
    }
    static long arraysum(long[]arr){
        long ans=0;
        for(int i=0; i<arr.length; i++){
            ans+=arr[i];
        }
        if(ans<0L){
            ans=Long.MAX_VALUE;
        }
        return ans;
    }
}
