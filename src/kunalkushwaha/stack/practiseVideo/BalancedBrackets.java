package kunalkushwaha.stack.practiseVideo;

import java.util.Scanner;
import java.util.Stack;
//problem-01
public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i = 0; i <n ; i++) {
            char ch = str.charAt(i);
            if (ch =='(') {
                st.push(ch);
            }
            else {  //here if ')' found then go to else block-means two condition will follow
                //if bucket is empty-reurn false
                //if at bucket top '(' found peek from top and remove by pop.
                if(st.size()==0) return false;
                if (st.peek()=='(') st.pop();
            }

        }
        if(st.size()>0) return false;
        else return true;
    }
}
