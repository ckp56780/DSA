package kunalkushwaha.stack.learn;



public class ImplementationOfStackBy_linked_List {

    //user defined data types
    public static class Node{
        int val;
        Node next;
        //constructor
        Node(int val){
            this.val=val;
        }
    }

    public static class LLStack{ //user defined data structure
       private Node head=null;
         private int size=0;
        void  push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        //display
        void displayRev(){
            Node temp =head;
            while (temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        //display
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        //calculate size
        int size(){ //getter
            return size;
        }

        //pop
        int pop(){
            if (head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }

        //peek
        int peek(){
            if (head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        //size
        boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }

    }


    public static void main(String[] args) {
        LLStack st = new LLStack();//we will create class for it .we will not import stack.
        st.push(2);
        st.display(); //2
        st.push(12);
        st.display(); //2 ,12
        st.push(123);
        st.display(); //2,12,123
        st.push(111);
        st.display(); //2,12,123,111
        System.out.println(st.size()); //4

    }

}
