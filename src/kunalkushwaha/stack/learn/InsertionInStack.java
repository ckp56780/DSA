package kunalkushwaha.stack.learn;

import java.util.Stack;
//program-03
//part-3:INSERTION IN STACK
public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);//[1,2,3,4,5]
        int index=2;
        int x=11;
        //created new stack:
        Stack<Integer> rt = new Stack<>();
        while (st.size()>index){
            rt.push(st.pop());
        }
        System.out.println(rt);//[5,4,3].
        st.push(x); //push required element where we want to insert //[1,2,7]

        //now again insert rt element back into the st so
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);//[1, 2, 11, 3, 4, 5]
    }
}
