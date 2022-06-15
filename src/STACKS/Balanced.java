package STACKS;
// https://www.youtube.com/watch?v=p-RbQyQevTQ&list=PL-Jc9J83PIiEyUGT3S8zPdTMYojwZPLUM&index=4
// Balanced Brackets

import java.util.Stack;

public class Balanced {
    //    SOLUTION :
    public static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '{' || t == '[') {
                st.push(t);
            } else if (t == ')') {
                boolean val = isTrue(st, '(');
                if(val == false){
                    return false;
                }
            }else if (t == '}') {
                boolean val = isTrue(st, '{');
                if(val == false){
                    return false;
                }
            }else if (t == ']') {
                boolean val = isTrue(st, '[');
                if(val == false){
                    return false;
                }
            }
        }
        if(st.size() == 0){
            return true;
        }
        return false;
    }
//    HELPER FUNCTIONS :
    public static boolean isTrue(Stack<Character> st, char crt) {
        if (st.size() == 0 || st.peek() != crt) {
            return false;
        }
        st.pop();
        return true;
    }

//    public static void main(String[] args) {
//        String s = "[[a+b]+(]þc+d)]";
//        System.out.println(check(s));
//    }
}
