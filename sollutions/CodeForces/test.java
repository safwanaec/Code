import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s=inp.nextLine();
        char[] c = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            //int max = Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
           for(int j=i; j<s.length(); j++){
                if((j==0 || j%2==0) && (i==0 || i%2==0)){
                    if(((int)c[j])<min){
                        min=((int)c[j]);
                        c[j]=c[i];
                        c[i]=(char)min;
                    }
                }     
           }
        }
        s=new String(c);
        System.out.println(s);
        inp.close();
    }
    /*public static void main(String[] args) {
       
        int[]nums1={0,0,3,0,0,0,0,0,0};
        int[]nums2={-1,1,1,1,2,3};
        merge(nums1, 3, nums2, 6);
        for(int i=0; i<(9); i++){
            System.out.print(nums1[i]+" ");
        }
        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {

            for (int i = n - 1; i >= 0; i--) {
                nums1[m + i] = nums2[i];
            }
            for (int i = 0; i < nums1.length/2; i++) {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int minindex = 0;
                int maxindex = 0;
                for (int j = i; j < m + n - i; j++) {
                    if (nums1[j] < min) {
                        min = nums1[j];
                        minindex = j;
                    }
                    if (nums1[j] > max) {
                        max = nums1[j];
                        maxindex = j;
                    }
                }
                if(nums1[i]!=min){
                    nums1[minindex] = nums1[i];
                    nums1[i] = min;
                }
                if (nums1[m + n - i - 1] != max) {
                    nums1[maxindex] = nums1[m + n - i - 1];
                    nums1[m + n - i - 1] = max;
                }

            }
        }
        
    }*/
}
