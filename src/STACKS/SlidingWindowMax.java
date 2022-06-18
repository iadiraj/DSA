package STACKS;
// Sliding Window Maximum
// https://www.youtube.com/watch?v=nKXUyUC3BNA&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=13
import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMax {
//    SOLUTION :
    public static int[] findMax(int[] arr, int k){
        int[] nextGrt = nextGreaterEle(arr);
        int[] ans = new int[arr.length];
        for(int i = 0; i <= arr.length - k; i++){
            int j = i;
            while(nextGrt[j] < i + k){
                j = nextGrt[j];
            }
            ans[i] = arr[j];
        }
        return ans;
    }
//    HELPER FUNCTIONS :
    public static int[] nextGreaterEle(int[] arr){
        Stack<Integer> st = new Stack<>();
        int len = arr.length;
        int[] ans = new int[len];
        st.push(len - 1);
        ans[len - 1] = len;
        for(int i = len - 2; i >= 0; i--){
            while(st.size() > 0 && arr[st.peek()] <= arr[i]){
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

//    public static void main(String[] args) {
//        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};
//        int k = 4;
//        System.out.println(Arrays.toString(findMax(arr, k)));
//    }
}
