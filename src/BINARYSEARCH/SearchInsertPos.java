package BINARYSEARCH;
// QUESTION 35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/

public class SearchInsertPos {
//    SOLUTION :
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
//    HELPER FUNCTIONS
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 5, 6, 7, 9};
//        int target = 4;
//        System.out.println(searchInsert(nums, target));
//    }
}
