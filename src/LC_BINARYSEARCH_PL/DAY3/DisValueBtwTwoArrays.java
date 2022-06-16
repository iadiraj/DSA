package LC_BINARYSEARCH_PL.DAY3;
// QUESTION 1385. Find the Distance Value Between Two Arrays
// https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

import java.util.Arrays;
// CONCEPT :
// |arr1[i]-arr2[j]| <= d
// -d <= arr1[i] - arr2[j] <= d
// arr2[j] - d <= arr1[i] <= arr2[j] + d

public class DisValueBtwTwoArrays {
//    SOLUTION :
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;

        for (int x : arr1)
            if (check(arr2, x - d, x + d))
                ans++;

        return ans;
    }
//  HELPER FUNCTIONS :
    private static boolean check(int[] arr, int from, int to){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= from && arr[mid] <= to){
                return false;
            }else if(arr[mid] < from){
                start = mid + 1;
            }else if((arr[mid] > to)){
                end = mid - 1;
            }
        }
        return true;
    }

//    public static void main(String[] args) {
//        int[] arr1 = {4,5,8};
//        int[] arr2 = {10,9,1,8};
//        int d = 2;
//        System.out.println(findTheDistanceValue(arr1, arr2, d));
//    }
}
