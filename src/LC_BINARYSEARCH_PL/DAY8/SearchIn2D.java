package LC_BINARYSEARCH_PL.DAY8;
// QUESTION 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/

class SearchIn2D {
//    SOLUTION :
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int start = 0;
        int end = m * n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid / m][mid % m] == target) {
                return true;
            } else if (matrix[mid / m][mid % m] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
//    HELPER FUNCTIONS :
//public static void main(String[] args) {
//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int target = 13;
//        System.out.println(searchMatrix(matrix, target));
//    }
}
