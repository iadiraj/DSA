package BINARYSEARCH;
// 154. Find Minimum in Rotated Sorted Array II
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class SearchMinInSortedRotArrII {
//    SOLUTION :
    public static int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[end]){
                end = mid;
            }else if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end--;
            }
        }
        return nums[start];
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 0, 1};
//        System.out.println(findMin(nums));
//    }
}
