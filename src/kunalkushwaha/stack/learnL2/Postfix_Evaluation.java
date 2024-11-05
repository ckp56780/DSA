package kunalkushwaha.stack.learnL2;

import java.util.Stack;

public class Postfix_Evaluation {
    public static void main(String[] args) {

        String str="953+4*6/-";
        Stack<Integer> val=new Stack<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);  //calculated here character values

            //first changing the character value into ascii
            int ascii=(int)ch;
            //check the number or operator
            //in case of number
            if (ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else {  //in case of operator
              int v2= val.pop();
              int v1=val.pop();
              if (ch=='+'){
                  val.push(v1+v2);
              }
                if (ch=='-'){
                    val.push(v1-v2);
                }
                if (ch=='*'){
                    val.push(v1*v2);
                }
                if (ch=='/'){
                    val.push(v1/v2);
                }
            }
        }
        System.out.println(val.peek()); //4
    }
}
