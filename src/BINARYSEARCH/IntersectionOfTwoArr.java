package BINARYSEARCH;
// QUESTION 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArr {
//    SOLUTION :
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1.length < nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(binarySearch((nums1), nums2[i])){
                set.add(nums2[i]);
            }
        }
        int[] ans = new int[set.size()];
        int i = 0;
        for(int x : set){
            ans[i] = x;
            i++;
        }
        return ans;
    }
    public static boolean binarySearch(int[] arr ,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return true;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
//  HELPER FUNCTION :
//    public static void main(String[] args) {
//        int[] nums1 = {4,9,5};
//        int[] nums2 = {9,4,9,8,4};
//        System.out.println(Arrays.toString(intersection(nums1, nums2)));
//    }
}
