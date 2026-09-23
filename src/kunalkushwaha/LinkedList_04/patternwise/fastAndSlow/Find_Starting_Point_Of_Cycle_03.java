package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;

// LeetCode 142
public class Find_Starting_Point_Of_Cycle_03 {

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

        // Create list: 1 -> 2 -> 3 -> 4 -> 5 -> 6

        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 6; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        // Create cycle: 6 -> 3

        current.next = head.next.next;

        Node cycleStart = detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node : " + cycleStart.data);
        } else {
            System.out.println("No Cycle Found");
        }
    }

    // Logic starts here
    private static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Find Start of Cycle
                Node entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry;
            }
        }

        return null;
    }
}