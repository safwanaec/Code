public class TwoSum1 {
    public static void main(String[] args) {
        TwoSum1 ts = new TwoSum1();
        int[]num={1,4,3,6,7,5,11,2,8};
        int[]result=ts.twoSum(num, 14);
        
        System.out.println(result[0]+" "+ result[1]);
        
    }
    public int[] twoSum(int[] nums, int target) {
        for(short i=0; i<nums.length; i++){
            for(short j=(short)(i+1); j<nums.length; j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}

