package LeetCode;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[]nums1={1,2,3,0,0,0};
        int[]nums2={2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.print(nums1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m+i]=nums2[i];
        }
    }

}