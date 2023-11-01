package LeetCode;

public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] arr= new int[17];
        System.out.println(arr[0]);
    }
    public int removeDuplicates(int[] nums) {
        int[] arr= new int[nums.length];
        arr[0]=nums[0];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j]!=nums[i]){
                    arr[i+1]=nums[j];
                    break;
                }
            }
        }
        return 0;
    }
}
