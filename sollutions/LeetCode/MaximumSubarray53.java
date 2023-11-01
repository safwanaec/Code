package LeetCode;
public class MaximumSubarray53{
    public static void main(String[] args) {
        int num[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }
    public static int maxSubArray(int[] nums) {
        //int min=nums[0];
        int max=nums[0];
        short[] position = new short[2];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i]; 
                position[1]=(short)i;
            }
            else if(nums[i]<max){
                //min=nums[i]; 
                position[0]=(short)i;
            }
        }
        

        return 0;
    }
}