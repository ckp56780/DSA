package kunalkushwaha.LinkedList.practiseByCk.singlyLinkedList;
//problem 01: insert element at end of the list:
public class LinkedList {
    private Node head;
    public static class Node{

        int data;
        Node next;
         public  Node(int data){
            this.data=data;
        }
    }

    public  void insertAtEnd(int data){
        Node newNode=new Node(data); //created new node
        if (head==null){
            // If the list is empty, set head to the new node
            head=newNode;
            return;
        }
        //traverse to end of the list
        Node temp=head;
        while (temp.next!=null){  //temp.next is next data and ref of other node
            temp=temp.next; //move to next till null not came
        }
        temp.next=newNode;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(12);
        list.insertAtEnd(112);
        list.display();
    }
}
