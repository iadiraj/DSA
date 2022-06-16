package BINARYSEARCH;
// QUESTION 153. Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class SearchMinInSortedRotArr {
//    SOLUTION :
    public static int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[end]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return nums[start];
    }
//    HELPER FUNCTIONS :
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }
}
