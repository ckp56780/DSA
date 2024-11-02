package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;

public class DeleteNthNodeFromEnd {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    //function for delete node from nth
    public static Node deleteNthFromEnd(Node head, int n){
        Node slow=head;
        Node fast=head;
        for (int i = 0; i <n ; i++) { //run this for loop till which n is given in question
            fast=fast.next;
        }
        if (fast==null){
            head=head.next;
            return head; //we are trying to delete the head
        }
        while (fast.next!=null){ //goes till end index
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head; //bcs we are trying to delete  head.
    }

    // Method to display the linked list
    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a=new Node(11);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(23);
        Node e=new Node(132);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //11 12 13 23 132
        displayList(a);
         a=deleteNthFromEnd(a,5);
        displayList(a);



    }
}
