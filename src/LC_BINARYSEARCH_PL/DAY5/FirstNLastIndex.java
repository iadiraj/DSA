package LC_BINARYSEARCH_PL.DAY5;
// QUESTION 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstNLastIndex {
//    SOLUTION :
    public static int[] searchRange(int[] nums, int target) {
        int first = findFirstLast(nums, target, true);
        int last = findFirstLast(nums, target, false);
        return new int[]{first, last};
    }
//    HELPER FUNCTIONS :
    public static int findFirstLast(int[] nums, int target, boolean isFirst){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

//    public static void main(String[] args) {
//        int[] nums = {5,7,7,8,8,1};
//        int target = 8;
//        System.out.println(Arrays.toString(searchRange(nums, target)));
//    }
}
