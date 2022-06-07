package LC_BINARYSEARCH_PL.DAY7;
// QUESTION 167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
import java.util.Arrays;

public class TwoSumII {
//    SOLUTION :
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            int req = target - numbers[i];
            int res = binarySearch(numbers, req);
            if(res != -1 && res != i){
                return new int[]{i+1, res+1};
            }
        }
        return new int[]{-1, -1};
    }
//    HELPER FUNCTIONS :
    public static int binarySearch(int[] numbers, int target){
        int start = 0;
        int end = numbers.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(numbers[mid] == target){
                ans = mid;
                start = mid + 1;
            }else if(numbers[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

//    public static void main(String[] args) {
//        int[] num = {1,2,3,4,4,9,56,90};
//        int target = 8;
//        System.out.println(Arrays.toString(twoSum(num, target)));
//    }
}
