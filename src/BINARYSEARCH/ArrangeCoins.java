package BINARYSEARCH;
// QUESTION 441. Arranging Coins
// https://leetcode.com/problems/arranging-coins/

public class ArrangeCoins {
//    SOLUTION :
    public static int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        while(start <= end){
            long mid = start + (end - start)/2;
            long temp = (mid*(mid+1))/2;
            if(temp <= n){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return (int)end;
    }

//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        System.out.println(arrangeCoins(16));
//    }
}
