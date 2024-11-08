package kunalkushwaha.queues.basicsPart01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//part-01
public class queueBasics {
    public static void main(String[] args) {
        //Queue queue = new PriorityQueue();
        //0r
        //Queue queue = new LinkedList();
        //or
        Queue<Integer> queue = new LinkedList<>();

        //adding element
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue); //[1, 2, 3, 4]

        //remove the element
        queue.remove();  //behaves like pop
        System.out.println(queue); //[2, 3, 4]

        //remove element by poll/remove
        queue.poll();
        System.out.println(queue);//[3, 4]

        //find the top of element is which first into queue

        System.out.println(queue.element());//3
        System.out.println(queue.peek()); //3

        //print the size of queue
        System.out.println(queue.size()); //2

        //find the queue is empty or full
        System.out.println(queue.isEmpty());  //false
    }

}
