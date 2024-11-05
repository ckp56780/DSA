package kunalkushwaha.stack.learnL1;

import java.util.Stack;
////problem-06
public class DisplayElement {

    //display reverse list by recursive function
    public static void displayRevRecursive(Stack<Integer> st1){
//        st1.push(6);
        //use base case
        if (st1.size()==0){
            return;
        }
        int top=st1.pop();
        System.out.print(top+" ");
        displayRevRecursive(st1);
        st1.push(top);
    }
//then again back into same condition
    public static void displayRecursive(Stack<Integer> st1){
//        st1.push(6);
        //use base case
        if (st1.size()==0){
            return;
        }
        int top=st1.pop();
        displayRecursive(st1);
        System.out.print(top+" ");
        st1.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        //System.out.println(st);

        //
        //displayRevRecursive(st);
        displayRecursive(st);



        //System.out.println(st);



        //System.out.println(st);//[1,2,3,4,5]

//        Stack<Integer> rt = new Stack<>();
//        while (st.size()>0) {
//            rt.push(st.pop());
//        }
//        while (rt.size()>0){
//            int x=rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }
//        System.out.println(st);

        //by array-
//        int n =st.size();
//        int[] arr=new int[n];
//        for (int i = n-1; i>=0 ; i--) {
//            int x = st.pop();
//            arr[i] = x;
//        }
//            //insert the element
//            for (int i = 0; i <n ; i++) {
//                System.out.println(arr[i]+" ");
//                int x=arr[i];
//                st.push(arr[i]);
//
//            }

        }
    }

