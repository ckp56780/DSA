package kunalkushwaha.LinkedList.singlyLinkedlist;

import static kunalkushwaha.LinkedList.singlyLinkedlist.BasicsLL2.Node.length;
//Q.FIND THE LENGTH OF given LINKED LIST::
public class BasicsLL2 {
    public static class Node {
        int data;
        Node next;  //reference of another node

        //create here the constructor of node
        Node(int data) {
            this.data = data;
        }

        //create the length method here
        public static int length(Node head){
            int count=0;
            while (head!=null) {
                count++;
                head = head.next;
            }
            return count;

        }


    }



    public static void main(String[] args) {

        BasicsLL2.Node a=new BasicsLL2.Node(5);
        BasicsLL2.Node b=new BasicsLL2.Node(10);
        BasicsLL2.Node c=new BasicsLL2.Node(15);
        BasicsLL2.Node d=new BasicsLL2.Node(20);
        BasicsLL2.Node e=new BasicsLL2.Node(25);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(length(a));






    }
}
