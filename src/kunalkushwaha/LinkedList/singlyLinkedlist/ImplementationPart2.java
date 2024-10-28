package kunalkushwaha.LinkedList.singlyLinkedlist;
//here we will learn about the how to insert element at beginning/Head/start
public class ImplementationPart2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    public static class linkedlist1{
        Node head=null;
        Node tail=null;
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ //empty list
                head=tail=temp;
            }else {
                temp.next=head; //for non empty list
                head=temp;

            }

        }

        //create display function
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args) {
        linkedlist1 ll2=new linkedlist1();
        ll2.insertAtHead(12);
        ll2.insertAtHead(112);
        ll2.display();

    }
}
