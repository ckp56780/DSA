package kunalkushwaha.stack.learn;

import java.util.Scanner;
import java.util.Stack;
//program-02 :print/copy content from one stack to another stack in the same order.
public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        int n;
//        System.out.println("Enter the number of element:");
//        n= sc.nextInt();
//        System.out.println("Enter the element");
//        for (int i = 1; i <=n; i++) {
//            int x= sc.nextInt();
//            st.push(x);
   // }

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); //[1, 2, 3, 4, 5] //yaha pe bottom 1 and top 5

        //reverse order
        Stack<Integer> ct=new Stack<>();
//        while (st.size()>0){
//            int x=st.peek(); //to find the top element into the st
//            ct.push(x); //means we are trying to push st element into ct
//            st.pop(); //then remove from top one from st.
//        }
//        System.out.println(ct);//[5, 4, 3, 2, 1] //yaha pe top 1 and bottom 5

        //or

        while (st.size()>0){
            ct.push(st.pop()); //so yaha pe pop ka kam hai st se uper k element ko lker aoo
            //fir ct me push kr do fir st s remove v kr do.
        }
        System.out.println(ct);

        //then again we need to return back same thing so,
        Stack<Integer> gt=new Stack<>(); //again create new stack then push here all from ct
        while (ct.size()>0){
            gt.push(ct.pop());
        }
        System.out.println(gt); //[1, 2, 3, 4, 5]
        System.out.println(st);
    }
}
