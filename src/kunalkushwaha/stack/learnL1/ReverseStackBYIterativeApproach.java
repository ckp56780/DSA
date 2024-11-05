package kunalkushwaha.stack.learnL1;

import java.util.Stack;
//problem-04-print stack in same bucket in reverse order
public class ReverseStackBYIterativeApproach {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(12);
        st.push(112);
        st.push(111);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> qt = new Stack<>();
        while (rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println(qt);

        //again push back into real st bucket
        while (qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
    }

}
