package LC_BINARYSEARCH_PL.DAY1;
// QUESTION 374. Guess Number Higher or Lower
// https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessNum {
//    SOLUTION :
    public static int guessNumber(int n){
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            int temp = guess(mid);
            if(temp == 0){
                return mid;
            }else if (temp == -1){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

//    HELPING FUNCTIONS :
    public static int guess(int pick){
        int num = 6;
        if(num > pick){
            return 1;
        }else if(num < pick){
            return -1;
        }
        return 0;
    }
//    public static void main(String[] args) {
//        int n = 10;
//        System.out.println(guessNumber(n));
//    }
}
