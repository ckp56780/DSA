package kunalkushwaha.LinkedList.singlyLinkedlist;

import static kunalkushwaha.LinkedList.singlyLinkedlist.BasicsLL.Node.*;

//This VVVI FILE-ALWAYS LEARN IT
public class BasicsLL {
    public static class Node{
        int data;
        Node next;  //reference of another node

        //create here the constructor of node
        Node(int data){
            this.data=data;
        }

        //create here method to call these each node by  without recursively-display element by recursion
        public static void display(Node head){
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }

        }
        //OR

        //CALLING LINKED LIST RECURSIVELY-display all element by recursion
        public static void displayR(Node head){
            if (head==null) //base condition
                return;
            System.out.print(head.data+" ");
            displayR(head.next);

        }



        //PRINT INTO REVERSE ORDER
        public static void displayRR(Node head){
            if (head==null) return;
            displayRR(head.next);
            System.out.print(head.data+" ");

        }
    }
    public static void main(String[] args) {
        Node x=new Node(5);
//        System.out.println(x); //kunalkushwaha.LinkedList.singlyLinkedlist.BasicsLL$Node@53d8d10a
//        System.out.println(x.data);  //0--default value of int will print
//        System.out.println(x.next);//null-it will print the another node reference value/address which will be null.
        Node y=new Node(7);
        Node z=new Node(9);
        Node a=new Node(32);
        Node b=new Node(52);
        System.out.println(x.data);
        System.out.println(y.data);
        System.out.println(z.data);
        System.out.println(a.data);
        System.out.println(b.data);

        //it will print below --
//5
//7
//9
//32
//52 //Above practise is not gud for printing it

        System.out.println("-----------------------------");
        //but we want to print each data which each connect to adjacent-5->7->9->32->52
        x.next=y;   //5->7 9 32 52
        System.out.println(x.data); //5
        System.out.println(x.next.data); //7 //bcs above we declare the reference-x.next=y;


        System.out.println("-----------------------------");
        y.next=z; //5->7->9 32 52
        z.next=a;  //5->7->9->32 52
        a.next=b;  //5->7->9->32->52

        //Note-with the help of Head means "a", we can calculate all other
//        System.out.println(x.data);
//        System.out.println(y.data); //or System.out.println(x.next.data);
//        System.out.println(z.data);  //  System.out.println(x.next.next.data);
//        System.out.println(a.data); //System.out.println(x.next.next.next.data);
//        System.out.println(b.data); //System.out.println(x.next.next.next.next.data);

        //or
        
//        System.out.println(x.data);
//        System.out.println(x.next.data);
//        System.out.println(x.next.next.data);
//        System.out.println(x.next.next.next.data);
//        System.out.println(x.next.next.next.next.data);
        //above that two-way to print the data is not a correct way:-

       // Node temp=x; //where x is head
       // System.out.println(temp.data);


//        for (int i = 0; i <5 ; i++) {
//            //System.out.println(temp.data);  //or
//            System.out.print(temp.data+" ");
//            temp=temp.next;

        //or
//
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

        //or

        //calling function here
        display(x);


        //or

        //display linked list recursively:-
        displayR(x);

        System.out.println(".......................");

        //To display linked list into reverse order
        //displayRR(x);

        //find the insertAtEnd id only head is given and linkedlist class is not been created
        insertAtEnd(a,87);
        display(a);


    }

    //if only head is given and perform insert at end if linkedlist class is not given
    private static void insertAtEnd(Node head,int val) {
        Node temp=new Node(val); //created new node
        Node t=head;
        while (t.next!=null){ //tab tak while loop ko chalao
            t=t.next;
        }
        t.next=temp;

    }
}
