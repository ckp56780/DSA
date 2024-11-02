package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;

// problem-05-leet-code-160
public class IntersectionOfTwoLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;  // Initialize tempA and tempB at headA and headB
        ListNode tempB = headB;

        // Find the length of both linked lists
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        // Bring tempA and tempB back to headA and headB
        tempA = headA;
        tempB = headB;

        // Align both pointers to the same starting position from the end
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }

        // Move both pointers until they meet at the intersection point
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        // Return the intersection node, or null if there is no intersection
        return tempA;
    }

    public static void main(String[] args) {
        // Create intersecting linked lists
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // First linked list: 3 -> 6 -> 9 -> 8 -> 10
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;

        // Second linked list: 4 -> 8 -> 10
        ListNode headB = new ListNode(4);
        headB.next = common;

        // Find the intersection node
        ListNode intersection = getIntersectionNode(headA, headB);

        // Print the result
        if (intersection != null) {
            System.out.println("The intersection node's value is: " + intersection.val);
        } else {
            System.out.println("The two linked lists do not intersect.");
        }
    }
}
