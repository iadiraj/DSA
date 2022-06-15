package STACKS;
// https://www.youtube.com/watch?v=kCAMWbTCO1c&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=9
// Stock Span
import java.util.Arrays;
import java.util.Stack;

public class StockSpans {
//    SOLUTION :
    public static int[] stockSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        st.push(0);
        ans[0] = 1;
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ans[i] = i+1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
//        System.out.println(Arrays.toString(stockSpan(arr)));
//    }
}
