package STACKS;
// https://www.youtube.com/watch?v=4eSFaEOa-l0&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=2
// Duplicate Brackets
import java.util.Stack;

public class Duplicate {
//    SOLUTION :
    public static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char t = s.charAt(i);
            if(t == ')'){
                if(st.peek() == '('){
                    return true;
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(t);
            }
        }
        return false;
    }
//    HELPER FUNCTIONS :
//    public static void main(String[] args) {
//        String s = "((a + b) + (c + d))";
//        System.out.println(check(s));
//    }
}
