package BINARYSEARCH;
// QUESTION 888. Fair Candy Swap
// https://leetcode.com/problems/fair-candy-swap/
import java.util.Arrays;

//    NOTE :
//    IN ORDER TO MAKE SUM A = SUM B, WE HAVE TO ADD AND SUBTRACT SOME VALUE ON BOTH SIDE.
//    SUM A + Y - X = SUM B + X - Y
//    Y = (SUM B - SUM A - 2X)/2;

public class FairCandySwap {
//    SOLUTION :
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Arrays.sort(bobSizes);
        int aliceTotal = calTotal(aliceSizes);
        int bobTotal = calTotal(bobSizes);
        for(int i = 0; i < aliceSizes.length; i++){
            int req = (bobTotal - aliceTotal + (2*aliceSizes[i]))/2;
            if(binarySearch(bobSizes, req)){
                return new int[]{aliceSizes[i], req};
            }
        }
        return new int[]{0, 0};
    }
//    HELPER FUNCTIONS :
    public static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
    public static int calTotal(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += arr[i];
        }
        return ans;
    }

//    public static void main(String[] args) {
//        int[] alice = {2};
//        int[] bob = {1, 3};
//        System.out.println(Arrays.toString(fairCandySwap(alice, bob)));
//    }
}
