package kunalkushwaha.queues.videoProblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReOrderTheQueueInterleavedConnection {
    public static void main(String[] args) {
        Queue<Integer>Queue =new LinkedList<>();
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        Queue.add(6);
        Queue.add(7);
        Queue.add(8);
        System.out.println(Queue); //[1, 2, 3, 4, 5, 6, 7, 8]

        //create the new stack
        Stack<Integer>st=new Stack<>();
        int n=Queue.size();
        for (int i = 1; i <=(n/2); i++) {
            st.push(Queue.remove());
            //stack is having - 4 3 2 1 and rest queue-5 6 7 8
            //again push that satck into queue
        }
        while (st.size()>0){
            Queue.add(st.pop());
            //queue is now - 5 6 7 8 4 3 2 1
        }
        for (int i = 1; i <=(n/2); i++) {
            st.push(Queue.remove());
            //stack is having - 8 7 6 5 and rest queue-4 3 2 1

        }
        //again push that stack and queue element into same queue by alternatively

        while (st.size()>0){
            //add one by one pahle stack se fir queue se
            Queue.add(st.pop());
            Queue.add(Queue.remove());
        }
        //8 4 7 3 6 2 5 1  we need 1 5 2 6 3 7 4 8
        while (Queue.size()>0){
            st.push(Queue.remove());
        }
        while (st.size()>0){
            Queue.add(st.pop());
        }
        System.out.println(Queue);





    }
}
