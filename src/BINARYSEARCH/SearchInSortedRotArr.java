package BINARYSEARCH;
// QUESTION 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInSortedRotArr {
//    SOLUTION :
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
//    HELPER FUNCIONS :
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 6, 0, 1, 2};
//        int target = 6;
//        System.out.println(search(arr, target));
//    }
}
