package kunalkushwaha.stack.learnL2;

import java.util.Stack;

public class infixToPrifix {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6"; //here all number is behaves like character then we have to perform task.
        System.out.println(infix);
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        //traverse loop from first to last
        for (int i = 0; i <infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int)ch; //change into ascii
            if (ascii>=48 && ascii<=57){//-&&-and operator,||-or operator//if not working then else-if will work
                String s=""+ch;
                val.push(s);

            } else if (op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            } else if (ch==')') {
                while (op.peek()!='('){
                    //WORK
                   String  v2 = val.pop();
                   String v1 = val.pop();
                    char o=op.pop();
                    String t=o+v1+v2;
                    val.push(t);
                }
                //POP
                op.pop(); //'(' hata diya

            } else {  //if above two not working then do this and finish the task
                if (ch=='+' || ch=='-'){
                    //work
                    while (!op.isEmpty() && (op.peek()=='+' || op.peek()=='-' || op.peek()=='*' || op.peek()=='/')) {
                        String  v2 = val.pop();
                        String v1 = val.pop();
                        char o=op.pop();
                        String t=o+v1+v2;
                        val.push(t);
                    }
                    op.push(ch);
                }
                if (ch=='*' || ch=='/'){
                    while (!op.isEmpty() && (op.peek()=='*' || op.peek()=='/')) {
                        String  v2 = val.pop();
                        String v1 = val.pop();
                        char o=op.pop();
                        String t=o+v1+v2;
                        val.push(t);
                    }
                    op.push(ch);
                }
            }
        }
        //then now val stack size should be 1
        while (val.size()>1){
            String  v2 = val.pop();
            String v1 = val.pop();
            char o=op.pop();
            String t=o+v1+v2;
            val.push(t);
        }
        String prefix=val.pop();
        System.out.println(prefix); //-9/*+5346
    }
}
