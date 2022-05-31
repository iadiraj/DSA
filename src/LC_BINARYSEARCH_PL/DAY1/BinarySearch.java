package LC_BINARYSEARCH_PL.DAY1;
// QUESTION 704. BINARY SEARCH
// https://leetcode.com/problems/binary-search/

public class BinarySearch {
//    SOLUTION :
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
//    HELPING FUNCTION :
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int target = 9;
//        System.out.println(search(nums, target));
//    }
}
