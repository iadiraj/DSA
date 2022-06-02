package BINARYSEARCH;
// QUESTION 2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
//    SOLUTION :
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int l = lrMost(nums, target, true);
        int r = lrMost(nums, target, false);
        ArrayList<Integer> ans = new ArrayList<>();
        if(l == -1 && r == -1){
            return ans;
        }
        for(int i = l; i <= r; i++){
            ans.add(i);
        }
        return ans;
    }
//    HELPER FUNCTIONS :
    public static int lrMost(int[] nums, int target, boolean side){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(side){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

//    public static void main(String[] args) {
//        int[] nums = {1,2,5,2,3};
//        int target = 2;
//        System.out.println(targetIndices(nums, target));
//    }
}
