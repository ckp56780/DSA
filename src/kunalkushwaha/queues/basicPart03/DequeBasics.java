package kunalkushwaha.queues.basicPart03;
//p-7
import java.util.Deque;
import java.util.LinkedList;

public class DequeBasics {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();  //here we are adding object
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(14);
        deque.addFirst(5);
        System.out.println(deque); //[5, 14, 3, 2, 1]-adding from left side
        deque.addLast(12);
        deque.addLast(11);
        System.out.println(deque);//[5, 14, 3, 2, 1, 12, 11] adding from right side

        //remove
        deque.removeFirst();
        System.out.println(deque); //[14, 3, 2, 1, 12, 11]

        deque.removeLast();
        System.out.println(deque);//[14, 3, 2, 1, 12]

        //get
        System.out.println(deque.getFirst()); //14
        System.out.println(deque.getLast()); //12

        //add
        deque.push(11);
        System.out.println(deque); //[11, 14, 3, 2, 1, 12]
        deque.add(34);
        System.out.println(deque); //[11, 14, 3, 2, 1, 12, 34] --adding from last-from right

        deque.remove();
        System.out.println(deque);//[14, 3, 2, 1, 12, 34]-remove first-from left


        //remove first and last occurrence
        deque.addFirst(14);
        deque.addLast(1);
        System.out.println(deque); //[14, 14, 3, 2, 1, 12, 34, 1]

        deque.removeFirstOccurrence(14);
        System.out.println(deque); //[14, 3, 2, 1, 12, 34, 1]

        deque.removeLastOccurrence(1);
        System.out.println(deque); //[14, 3, 2, 1, 12, 34]
        //remove all
        System.out.println(deque.removeAll(deque)); //true
        deque.removeAll(deque);
        System.out.println(deque); //[]


    }

}
