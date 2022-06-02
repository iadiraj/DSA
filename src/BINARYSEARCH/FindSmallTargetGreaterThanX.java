package BINARYSEARCH;
// QUESTION 744. Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallTargetGreaterThanX {
//    SOLUTION :
    public static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(letters[mid] <= target){
                start = mid + 1;
            }else{
                ans = letters[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        char[] letters = {'c', 'f', 'j'};
//        char[] target = {'a', 'c', 'j'};
//        for(char x : target){
//            System.out.println(nextGreatestLetter(letters, x));
//        }
//    }
}
