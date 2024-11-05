package kunalkushwaha.stack.learnL1;

import java.util.Stack;
//problem-05
public class PushAtBottomAndReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(12);
        st.push(112);
        st.push(111);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()==1){
            return;
        }
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    private static void pushAtBottom(Stack<Integer> st,int x) {
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
}
