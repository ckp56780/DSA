package kunalkushwaha.queues.basicsPart01;

import java.util.LinkedList;
import java.util.Queue;

//part-02-print all element of queue.
public class DisplayQueues {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        //adding element
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q); //[1, 2, 3, 4]
        Queue<Integer> helper = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek() +" "); //nikal kr print kara liya
//            Integer x = queue.poll(); //yaha se ab remove krke ek variable me save kr liya
//            helper.add(x); //helper queue me chod diya
            helper.add(q.remove()); //queue.poll() v de skate hai
        }
        while (helper.size()>0){
            q.add(helper.poll());//
        }

    }
}
