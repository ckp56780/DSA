package kunalkushwaha.queues.videoProblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//prog:-01:write a program to reverse a queue.
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);queue.add(3);queue.add(4);
        queue.add(5);
        System.out.println(queue);//[1, 2, 3, 4, 5]
        //weh have to reverse queue
        Stack<Integer>stack=new Stack<>();
        while (queue.size()>0){
            stack.push(queue.remove()); //stack me daldo with push which is used into stack and remove from queue so reomve used from queue
        }
        System.out.println(stack); //[1, 2, 3, 4, 5] this is stack
        //then again push back into queue
        while (stack.size()>0){
            queue.add(stack.pop()); //queue me dal do-which add method used ||use remove element from stack use pop
        }
        System.out.println(queue); //[5, 4, 3, 2, 1]
    }


}
