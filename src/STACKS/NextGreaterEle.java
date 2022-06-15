package STACKS;
// https://www.youtube.com/watch?v=Zy9XnXw8E7U&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=6
// Next Greater Element on the Right
import java.util.Stack;

public class NextGreaterEle {
//    SOLUTION :
    public static void nextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        System.out.println(arr[arr.length-1] + " = -1");
        for(int i = arr.length-2; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                System.out.println(arr[i] + " = -1");
            }else{
                System.out.println(arr[i] + " = " + st.peek());
            }
            st.push(arr[i]);
        }
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
//        nextGreater(arr);
//    }
}
