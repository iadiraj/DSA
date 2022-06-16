package BINARYSEARCH;
// QUESTION 81. Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchInSortedRotArrII {
//    SOLUTION :
    public static boolean search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[start] < nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(nums[mid] < nums[end]){
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                end--;
            }
        }
        return false;
    }
//    HELPER FUNCTIONS :
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
    }
}
