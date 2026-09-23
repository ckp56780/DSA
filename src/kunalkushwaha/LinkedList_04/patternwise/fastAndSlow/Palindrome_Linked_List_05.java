package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;

// LeetCode 234
public class Palindrome_Linked_List_05 {

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

        // 1 -> 2 -> 3 -> 2 -> 1

        int[] arr = {1, 2, 3, 2, 1};

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        boolean result = isPalindrome(head);

        System.out.println("Is Palindrome : " + result);
    }


    //only study this only
    private static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 : Find Middle ==both ponter first at head
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
       // yaha tak tho samjh m aa gya hai

        // Step 2 : Reverse Second Half 1-2-[3-2-1]--->3-2-1--->after reverse-->1-2-3
        Node prev = null; //take empty container
        Node current = slow;

        while (current != null) {
//here we use like one another empty container to reverse
            Node next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 3 : Compare First Half and Reversed Half
        Node first = head;
        Node second = prev;

        while (second != null) {

            if (first.data != second.data) {
                return false;
            }

            first = first.next;
            second = second.next;
        }
        return true;
    }
}