package BINARYSEARCH;
// QUESTION 1346. Check If N and Its Double Exist
// https://leetcode.com/problems/check-if-n-and-its-double-exist/
import java.util.Arrays;

public class CheckIfNandDoubleExits {
//    SOLUTION :
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            int temp = check(arr, arr[i]*2);
            if(temp != -1 && temp != i){
                return true;
            }
        }
        return false;
    }
//    HELPER FUNCTIONS :
    public static int check(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

//    public static void main(String[] args) {
//        int[] arr = {0, 2, 3};
//        System.out.println(checkIfExist(arr));
//    }
}
