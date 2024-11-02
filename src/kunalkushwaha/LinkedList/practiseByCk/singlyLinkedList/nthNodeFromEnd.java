package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
//3.vvi question-find the nth node from the last
//here we soled this problem with two method
public class nthNodeFromEnd {
    public  static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
//method-01
    public static Node nthNode(Node head,int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int p=size-n+1; //here p is bucket where wwe will store the value and which is pth node from start
        
        //find pth node from start
        //bring temp to head
        temp=head;
        for (int i = 0; i <p-1 ; i++) {
            temp=temp.next;
            
        }
        return temp;
    }
//method-02
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast =head;
//        for (int i = 0; i <n ; i++) {
//            fast=fast.next;
//        }
        //or
        for (int i = 1; i <=n ; i++) {
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
//100 13 4 5 12 10  //T.C=0(n)-bcs we are travelling 1 to n term.
       Node q= nthNode(a,2);

        System.out.println();
        System.out.println(q.data);

        //2nd method to find nth node from the last
        Node p= nthNode2(a,2);
        System.out.println();
        System.out.println(p.data);




    }
}
