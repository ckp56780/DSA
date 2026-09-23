package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;

// LeetCode 141
public class Detect_Cycle_02 {

    // First create Node
    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Creating linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6

        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 6; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        // Creating cycle:
        // 6 -> 3
        current.next = head.next.next;



        boolean result = hasCycle(head);

        System.out.println("Cycle Present : " + result);
    }

    // Logic starts here
    private static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}