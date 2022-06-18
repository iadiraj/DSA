package BINARYSEARCH;

import static java.lang.Math.*;

public class SumOfSquareNum {
//    SOLUTION :
    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);
        while(start <= end){
            long mid = start + (end - start)/2;
            int temp = check(c, (int)mid);
            if(temp == 0){
                return true;
            }else if(temp == 1){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }
    public static int check(int c, int x){
        double ans = sqrt(c - x*x);
        if(Double.isNaN(ans)){
            return -1;
        }else if(ans%1 != 0){
            return 1;
        }else{
            return 0;
        }
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int c = 29;
//        System.out.println(judgeSquareSum(c));
//
//    }
}
