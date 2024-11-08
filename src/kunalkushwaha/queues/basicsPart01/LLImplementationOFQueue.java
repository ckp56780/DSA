package kunalkushwaha.queues.basicsPart01;
//part-04
public class LLImplementationOFQueue {
    //create node class
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    //create LLQueue
    public static class LLQueue{
        Node head=null;
        Node tail=null;
        int size=0;

        //create add method
        public  void add(int x){
            Node temp=new Node(x);
            if (size==0) {
                head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        //peek or top element
        public int peekLL(){
            //size is empty
            if (size==0 ){
                System.out.println("stack is empty ");
                return -1;
            }
            return head.val;
        }

        //remove function
        public void removeLL(){
            //size is empty
            if (size==0 ){
                System.out.println("stack is empty ");
                return;
            }
            int x=head.val;
            head=head.next;
            size--;
        }

        //display the data:
        public void displayLL(){
            //size is empty
            if (size==0 ){
                System.out.println("queue is empty ");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();

        }

        //is Empty
        public  boolean isEmptyArray(){
            if (size==0) return  true;
            else return false;
        }



    }


    public static void main(String[] args) {

        LLQueue ll=new LLQueue();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.displayLL();

        //find top element
        System.out.println(ll.peekLL()); //1

        System.out.println("--------");
        //remove
        ll.removeLL();
        ll.displayLL(); //2 3 4

        System.out.println(ll.isEmptyArray());  //false

        System.out.println(ll.size);//3
    }
}
