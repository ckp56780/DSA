package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
//problem04-leetcode-237
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Cannot delete if node is null or if it is the tail node
        }

        // Copy data from the next node into the current node
        node.val = node.next.val;

        // Point current node to the node after the next (skipping the next node)
        node.next = node.next.next;
    }

    // Method to display the linked list
    public static void displayList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the linked list: 4 -> 5 -> 1 -> 9
        Solution.ListNode head = new Solution.ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Original List: ");
        displayList(head);

        // Instantiate Solution class
        Solution solution = new Solution();

        // Delete the node with value 5 (second node in the list)
        solution.deleteNode(head.next);

        System.out.print("List after deletion: ");
        displayList(head);
    }
}
