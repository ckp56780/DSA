package kunalkushwaha.stack.learnL2;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
//        int x=9-5+3*4/6;
//        System.out.println(x); //6
        String str="9-(5+3)*4/6"; //here all number is behaves like character then we have to perform task.
        Stack<Integer> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        //traverse loop from first to last
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            //System.out.print(ch);//9-5+3*4/6
            int ascii = (int)ch; //change into ascii
            if (ascii>=48 && ascii<=57){  //-&&-and operator,||-or operator//if not working then else-if will work
                val.push(ascii-48);
            } else if (op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    //WORK
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek()=='-') val.push(v1-v2);
                    if (op.peek()=='+') val.push(v1+v2);
                    if (op.peek()=='*') val.push(v1*v2);
                    if (op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                //POP
                op.pop(); //'(' hata diya

            } else {  //if above two not working then do this and finish the task
                if (ch=='+' || ch=='-'){
                    //work
                    while (!op.isEmpty() && (op.peek()=='+' || op.peek()=='-' || op.peek()=='*' || op.peek()=='/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek()=='-') val.push(v1-v2);
                        if (op.peek()=='+') val.push(v1+v2);
                        if (op.peek()=='*') val.push(v1*v2);
                        if (op.peek()=='/') val.push(v1/v2);
                        op.pop();
                    }
                    op.push(ch);
                }
                if (ch=='*' || ch=='/'){
                    while (!op.isEmpty() && (op.peek()=='*' || op.peek()=='/')) {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek()=='*') val.push(v1*v2);
                        if (op.peek()=='/') val.push(v1/v2);
                        op.pop();
                    }
                    op.push(ch);
                }
            }
        }
        //then now val stack size should be 1
        while (val.size()>1){
            int v2=val.pop();
            int v1=val.pop();
            if (op.peek()=='-') val.push(v1-v2);
            if (op.peek()=='+') val.push(v1+v2);
            if (op.peek()=='*') val.push(v1*v2);
            if (op.peek()=='/') val.push(v1/v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
