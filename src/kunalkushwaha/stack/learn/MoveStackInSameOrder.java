package kunalkushwaha.stack.learn;

import java.util.Scanner;
import java.util.Stack;

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
        System.out.println(st);

        //reverse order
        Stack<Integer> ct=new Stack<>();
        while (st.size()>0){
            ct.push(st.pop());
        }
        System.out.println(ct);

        //then again we need to return same thing so,
        Stack<Integer> gt=new Stack<>();
        while (ct.size()>0){
            gt.push(ct.pop());
        }
        System.out.println(gt);
    }
}
