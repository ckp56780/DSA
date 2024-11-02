package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
// problem-08-find the middle of linked list:--if odd list is given
public class MiddleOfOddLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }



        public static ListNode findMiddle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            // Move fast pointer two steps and slow pointer one step
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // When fast reaches the end, slow will be at the middle
            return slow;
        }

        public static void main(String[] args) {
            // Create an odd-length linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // Find the middle node
            ListNode middle = findMiddle(head);

            // Print the value of the middle node
            if (middle != null) {
                System.out.println("The middle node's value is: " + middle.val);
            } else {
                System.out.println("The linked list is empty.");
            }

        }

}
