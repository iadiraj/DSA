package BINARYSEARCH;
// QUESTION 367. Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
//    SOLUTION :
    public static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long start = 0;
        long end = num/2;
        while(start <= end){
            long mid = start + (end - start)/2;
            long temp = mid*mid;
            if(temp == num){
                return true;
            }else if(temp < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

//    HELPER FUNCTION :
//    public static void main(String[] args) {
//        System.out.println(isPerfectSquare(1));
//    }
}
