package BINARYSEARCH;
// QUESTION 1608. Special Array With X Elements Greater Than or Equal X
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

import java.util.Arrays;

public class SpecialArraysXGreaterEle {
//    SOLUTION :
    public static int specialArray(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++){
            int ans = search(nums, i);
            int dist = nums.length - ans;
            if(dist == i){
                return i;
            }
        }
        return -1;
    }
//    HELPER FUNCTION :
    public static int search(int[] nums, int target){ // THIS ALGORITHM IS A MIXTURE OF SEARCH INSERT POSITION AND FIND FIRST OCCURRENCE.
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if(ans != -1){
            return ans;
        }
        return start;
    }

//    public static void main(String[] args) {
//        int[] nums = {1};
//        System.out.println(specialArray(nums));
//    }
}
