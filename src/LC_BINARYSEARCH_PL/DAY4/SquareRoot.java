package LC_BINARYSEARCH_PL.DAY4;
// QUESTION 69. Sqrt(x)
// https://leetcode.com/problems/sqrtx/

public class SquareRoot {
//    SOLUTION :
    public static int mySqrt(int x) {
        if(x <= 1){
            return x;
        }
        long start = 0;
        long end = x/2;
        while(start <= end){
            long mid = start + (end - start)/2;
            long temp = mid * mid;
            if(temp == x){
                return (int)mid;
            }else if(temp < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return (int)end;
    }
//    HELPER FUNCTIONS :
//public static void main(String[] args) {
//    System.out.println(mySqrt(2147395599));
//    System.out.println(mySqrt(4));
//    System.out.println(mySqrt(1));
//    System.out.println(mySqrt(0));
//    System.out.println(mySqrt(2));
//}
}
