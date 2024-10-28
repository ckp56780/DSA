package kunalkushwaha.LinkedList;
//here we will understand about the how to add element at end which will pont to null.
public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    //creating linked list class which will add element at end
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        //creating method which will add element at start/Head/beginning
//        Node head=null;
//        Node tail=null;
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){ //empty list
                head=tail=temp;
            }else {
                temp.next=head; //for non empty list
                head=temp;

            }
            size++;

        }

        //insert at any index where you want to require
        void insertAt(int index, int val){
            Node t=new Node(val);
            Node temp=head;

            if (index==size){
                insertAtEnd(val);
                return; //it will give u the correct last index number after adding at last
            } else if (index==0) {
                insertAtHead(val);
                return;
            } else if (index<0 || index>size) {
                System.out.println("Invalid index number");
            }

            for (int i = 0; i <index-1 ; i++) {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }

        //get element at given index
        int getElementAtGivenIndex(int index){

            if (index<0 || index>size){
                System.out.println("invalid index");
            }
            Node temp=head;
            for (int i = 0; i <index ; i++) {
                temp=temp.next;
            }
            return temp.data;
        }

        //delete element at given index
        void deleteAtGivenIndex(int index){
            if(index==0) {
                head=head.next; //to delete 0th index
                size--;
                return;
            }
            Node temp=head;
            for (int i = 0; i <index-1 ; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp; //to delete the last index
            size--;
        }


        //create display function
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

//        //create the size function
//        int size(){
//            Node temp=head;
//            int count=0;
//            while (temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//
//        }
    }


    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4); //4
        ll.insertAtEnd(5);//4->5
        ll.display();

        System.out.println(" ");

        System.out.println(ll.size);


        System.out.println("....");
        //inserting one more element into linked list
        ll.insertAtEnd(13);//4->5->13
        ll.display();

        System.out.println();

        System.out.println("add new element here then get the result:");
        ll.insertAtHead(12);
        ll.insertAtHead(177);
        ll.display();

        System.out.println();
        //add new element at index 2 so
        ll.insertAt(2,112);
        ll.insertAt(6,101); //last index is 101 but when we find last then it shows only 13
        //so we need to correct some changes into the code.
        ll.display();

        System.out.println("@@@@@@@@@@");
        System.out.println(ll.head.data+" " +  "First index number");
        System.out.println(ll.tail.data+ " "+"last index number if we add any element at end");

        //here we will try to add at zero index,if not give good answer we nned to agagain refactor the above code
//        ll.insertAt(0,999); //here it is adding at 1th index,so need to correct the code
//        ll.display(); //177 999 12 112 4 5 13 101

        ll.insertAt(0,999);
        ll.display();


        System.out.println();
        //calling here the delete function
        //ll.deleteAtGivenIndex(3);//999 177 12 4 5 13 101
        //ll.deleteAtGivenIndex(6); //999 177 12 4 5 13
        ll.deleteAtGivenIndex(0);
        ll.display();//999 177 12 112 4 5 13


        System.out.println();
        System.out.println(ll.tail.data);//



        System.out.println(" ");
        //get the element at given index
        System.out.println(ll.getElementAtGivenIndex(0)); //here 0 is index number.

    }
}
