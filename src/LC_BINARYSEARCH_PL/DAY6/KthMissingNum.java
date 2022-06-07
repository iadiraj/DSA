package LC_BINARYSEARCH_PL.DAY6;
// QUESTION 1539. Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/

public class KthMissingNum {
//    SOLUTION :
    public static int findKthPositive(int[] arr, int k) {
        if(k < arr[0]){
            return k;
        }
        int[] ans = new int[2];
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                ans[0] = missing;
                ans[1] = arr[mid];
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans[1] + (k - ans[0]);
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 7, 11};
//        int k = 2;
//        System.out.println(findKthPositive(arr, k));
//    }
}
