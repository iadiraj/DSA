package BINARYSEARCH;
// QUESTION 278. First Bad Version
// https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion {
//    SOLUTION :
    public static int firstBadVersion(int n) {
        long start = 0;
        long end = n;
        while(start < end){
            long mid = start + (end - start)/2;
            if(isBadVersion((int)mid)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return (int)start;
    }

//    HELPING FUNCTIONS :
    public static Boolean isBadVersion(int version){
        int target = 1;
        return version >= target ? true : false;
    }

//    public static void main(String[] args) {
//        System.out.println(firstBadVersion(10));
//    }
}
