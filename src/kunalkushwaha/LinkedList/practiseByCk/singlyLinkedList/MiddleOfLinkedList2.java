package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
// problem-07-find the middle of linked list
// if even  and odd list is given is test case-this is Leet-code question-876
//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfLinkedList2 {
    //approach:
//    We use a slow and fast pointer approach:
//
//    slow moves one step at a time.
//    fast moves two steps at a time.
//    When fast reaches the end of the list, slow will be at the middle node.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {
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
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Find the middle node
        ListNode middle = middleNode(head);

        // Print the value of the middle node
        if (middle != null) {
            System.out.println("The middle node's value is: " + middle.val);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
