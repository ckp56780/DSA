package kunalkushwaha.LinkedList_04.patternwise.fastAndSlow;
//LeetCode 876
//For the next few days, solve only: 876 → 141 → 202 → 142 → 234
public class Find_Middle_Node_01 {

    //first create node
    public static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5====if odd==3
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5->6 ====if even====4
        Node head = new Node(1);
        Node current = head;

        for (int i = 2; i <= 6; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        Node middle = middleNode(head);
        System.out.println("Middle Node: " + middle.data);
    }

    //yaha se logic likhna hai sirf
    private static Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;

        //condition
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
