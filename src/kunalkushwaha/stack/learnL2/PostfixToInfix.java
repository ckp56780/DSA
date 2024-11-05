package kunalkushwaha.stack.learnL2;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<String> val=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);  //calculated here character values

            //first changing the character value into ascii
            int ascii=(int)ch;
            //check the number or operator
            //in case of number
            if (ascii>=48 && ascii<=57){
                val.push(ch+"");
            }else {  //in case of operator
                String  v2= val.pop();
                String v1=val.pop();
                char op=ch;
                //infix=v1 op v2     //this is infix-(9-(((5+3)*4)/6))
                String t="("+v1+op+v2+")";
                val.push(t);
            }
        }
        System.out.println(val.peek()); //(9-(((5+3)*4)/6))
    }
}
