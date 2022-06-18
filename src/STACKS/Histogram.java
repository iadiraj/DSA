package STACKS;
// Largest Area Histogram
// https://www.youtube.com/watch?v=m01ubOp-FMg&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=11
import java.util.Stack;

public class Histogram {
//    SOLUTION :
    public static int findArea(int[] arr){
        int[] left = calLeftSmallest(arr);
        int[] right = calRightSmallest(arr);
        int maxArea = -1;
        for(int i = 0; i < arr.length; i++){
            int width = (right[i] - left[i]) - 1;
            int area = arr[i] * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
//    HELPER FUNCTIONS :
    public static int[] calRightSmallest(int[] arr){
        Stack<Integer> st = new Stack<>();
        int len = arr.length;
        int[] ans = new int[len];
        st.push(len - 1);
        ans[len - 1] = len;
        for(int i = len - 2; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = len;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static int[] calLeftSmallest(int[] arr){
        Stack<Integer> st = new Stack<>();
        int len = arr.length;
        int[] ans = new int[len];
        st.push(0);
        ans[0] = -1;
        for(int i = 0; i < len; i++){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

//    public static void main(String[] args) {
//        int[] arr = {2, 4, 1, 6, 3, 5};
//        System.out.println(findArea(arr));
//    }
}
