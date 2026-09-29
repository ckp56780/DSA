package kunalkushwaha.LinkedList_04.patternwise.twoPointer;

// LeetCode 19
public class Remove_Nth_Node_From_End_06 {

    // Create Node
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create list:
        // 1 -> 2 -> 3 -> 4 -> 5

        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 5; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        int n = 2;

        Node result = removeNthFromEnd(head, n);

        printList(result);
    }

    // Logic starts here
    private static Node removeNthFromEnd(Node head, int n) {

        // Step 1 : Create dummy node
        Node dummy = new Node(0);
        //0 -> 1 -> 2 -> 3 -> 4 -> 5
//        ↑
//      dummy
        dummy.next = head;

        // Step 2 : Initialize two pointers--which will point to dummy
        //0->1->2->3->4->5
        Node first = dummy;
        Node second = dummy;

        // Step 3 : Move first n+1 steps ahead
        //now first now try to move first with n+1 steps
        //means n=2 which is from last so n+1=2+1=3 so-n=3,travel till n=3
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Step 4 : Move both pointers
        //after reaching at position before the node which want to delete
        //then now run both node with same speed like one steps-
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Step 5 : Delete node
        //now second come to before that node which want to delete
        // Step 5 : Delete node
        second.next = second.next.next; //so heree distconnect 4 and add with 5===3->5
        /*means--
        3 -> 4 -> 5
        ↑
      second
      second.next = second.next.next;
      jaha pe second.nex=4
      second.next.next=5
      so 4 ko 5 se replace kr do
      3.next = 5;
      3 ------> 5
        */

        // Step 6 : Return updated head
        return dummy.next;
    }

    private static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}