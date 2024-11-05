package kunalkushwaha.stack.learn;

import java.util.Stack;
//program-01
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println("size of the stack:"+st.size()); //0
        System.out.println(st); //[]
        System.out.println(st.empty()); //true

        //use of push-T-C-0(1)
        st.push(10);
        st.push(12);
        st.push(112);
        st.push(111);
        System.out.println(st); //[10, 12, 112]

        //use of peek-T.C-0(1)
        //it will return the top most of element
        //System.out.println(st.peek()); //111

        //use of pop-T.C-0(1)
       // st.peek(); //nothing will print
        st.pop();//nothing will print
        System.out.println(st); //[10, 12, 112]

        st.peek();
        System.out.println(st); //[10, 12, 112]

        //print the size of stack
        System.out.println("size of the stack:"+st.size()); //3



        //q.can i find the 2nd element into the stacks-yes
        while (st.size()>2){
            st.pop();
        }
        System.out.println(st.peek()); //12
        System.out.println(st); //[10, 12] //tc-O(N)


        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println(st);
        System.out.println("size of the stack:"+st.size());

        System.out.println("-----------");
        st.push(110);
        System.out.println(st);
        System.out.println("size of the stack:"+st.size());

        System.out.println("-----------");
        st.push(1111);
        System.out.println(st);
        System.out.println("size of the stack:"+st.size());

        System.out.println("-----------");
        st.push(11114);
        System.out.println(st);
        System.out.println("size of the stack:"+st.size());

        System.out.println(st.empty()); //false
        System.out.println(st.isEmpty()); //false
    }
}
