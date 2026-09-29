package kunalkushwaha.LinkedList_04.patternwise.twoPointer;

public class OddEvenLinkedList_08 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        // input- 1->2->3->4->5->6
        // output- 1->3->5->2->4->6

        //first ood node point to head,even node point to next after head means head.next
        //and later evenHead will store the even value
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        //iska logic mujhse samjh m nahi aya hai dekha padega
        while (even != null && even.next != null) {

            //matlb 2 ko 3 se replace kr do so--1->3,odd.next means 2 and even.next means 3
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        ListNode current = head;

        for (int i = 2; i <= 6; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        System.out.println("Original List:");
        printList(head);

        head = oddEvenList(head);

        System.out.println("After Odd-Even Reordering:");
        printList(head);
    }
}