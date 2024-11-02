package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
// problem-06-find the middle of linked list
// if even list is given-this not leet-code question

public class LinkedListMiddleFinder {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        int length = 0;

        // Step 1: Calculate the length of the linked list
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Find the middle index
        int midIndex = length / 2;

        // Step 3: Reset temp to head and move to the middle
        temp = head;
        for (int i = 0; i < midIndex; i++) {
            temp = temp.next;
        }

        return temp;
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
        ListNode middle = findMiddle(head);

        // Print the value of the middle node
        if (middle != null) {
            System.out.println("The middle node's value is: " + middle.val);
        } else {
            System.out.println("The linked list is empty.");
        }
    }

}
