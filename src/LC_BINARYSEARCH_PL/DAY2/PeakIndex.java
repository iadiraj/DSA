package LC_BINARYSEARCH_PL.DAY2;
// QUESTION 852. Peak Index in a Mountain Array
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndex {
//    SOLUTION :
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] arr2 = {0};
//        System.out.println(arr1[peakIndexInMountainArray(arr1)]);
//        System.out.println(arr2[peakIndexInMountainArray(arr2)]);
//    }
}
