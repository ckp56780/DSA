package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;

public class fastAndSlow_notes_01 {
    public static void main(String[] args) {
        //=======First Question in Every Problem=========
        //Before coding, ask:
        //Does the problem involve
        //Middle element?
        //Cycle detection?
        //Length unknown?
        //Moving at different speeds?
        //Finding a position relative to the middle?
        //If YES → Think Fast & Slow Pointer.

        //===========Pattern Template=============
        //Memorize this.
        //ListNode slow = head;
        //ListNode fast = head;
        //while(fast != null && fast.next != null){
        //    slow = slow.next;
        //    fast = fast.next.next;
        //

        /*
        Observation:--
        Instead of using one pointer:
        current = current.next;

        Use two pointers:
        slow = slow.next;       // moves 1 step
        fast = fast.next.next;  // moves 2 steps
        Because fast moves twice as fast as slow, some interesting things happen:

        =============Visualization==========
        example
        1 -> 2 -> 3 -> 4 -> 5 -> null

        Initially
        slow = 1
        fast = 1

        Iteration 1

        slow = 2
        fast = 3

        Iteration 2

        slow = 3
        fast = 5

        When fast reaches the end:
        slow = middle node
        This single observation solves many problems
        */
    }
}
