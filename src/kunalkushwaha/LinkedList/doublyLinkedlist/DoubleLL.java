package kunalkushwaha.LinkedList.doublyLinkedlist;

public class DoubleLL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }
    //get all element from Head side
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //get all element from tail side
    static void displayRev(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
    }

    //Display all element if head or tail is not given
    // but any random node is given from the doubly linked list:
    static void displayRandom(Node random){
        Node temp=random;
        while (temp.prev!=null){  //checking for head to get head
            temp=temp.prev;
        }
        //now we are on the head
        //print the list of doubly linked list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //insert at Head in DLL
    public static Node insertAtHead(Node head,int x){
        Node t=new Node(30);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }

    ////insert at tail in DLL
    public static void insertAtTail(Node head,int x){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        //now we are at tail point
        //now we have to find inset the new element at tail
        Node t=new Node(x);
        temp.next=t;
        t.prev=temp;

    }

    //insert element at any index of the DLL
    public static void insertAtAnyIndex(Node head,int index,int x){
        Node s=head;
        for (int i = 0; i <index-1 ; i++) {
            s=s.next;
        }
        //s is index-1 position
        Node r=s.next; //index position
        Node t=new Node(x); //insert the value which i want to insert basically
        //s t r
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }

    //delete at Head
//    public static void deleteAtHead(Node head) {
//        // Check if the list is empty
//        if (head == null) {
//            return;
//        }
//
//        // Move the head pointer to the next node
//        head = head.next;
//
//        // If the new head is not null, set its prev pointer to null
//        if (head != null) {
//            head.prev = null;
//        }
//
//    }

    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(12);
        Node d=new Node(41);
        Node e=new Node(14);
        a.prev=null;
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;

        e.next=null;

        display(a);

        //add at tail
//        insertAtTail(a,111);  //if only head is given
//        display(a);


//        displayRev(e);
//
//        System.out.println();
//        //display linked list from doubly linked list by giving the random number
//        displayRandom(b);  //here a,b,c,d,e -we can take.
//
//
//        //add element at head
//        Node node = insertAtHead(a, 30);
//        display(node);



        //insert at any index in DLL
        display(a);
        insertAtAnyIndex( a,3,115);
        display(a);


        //delete at Head
//        deleteAtHead(a);
//        display(a);
    }

}
