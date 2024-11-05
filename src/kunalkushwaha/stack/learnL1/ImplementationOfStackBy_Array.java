package kunalkushwaha.stack.learnL1;
//problem-07
public class ImplementationOfStackBy_Array {

   // stack class
    public static class Stack{
       private final int[] arr=new int[4];
       private int index=0;

       //create push method; inset element
        void push(int x){
            //check stack is full
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }

                arr[index]=x; //at index push element
                index++;

       }

       //peek function
       int peek(){
           if(index==0){
               System.out.println("empty array!");
               return -1;
           }
           return index-1; //check back when top not shows;
       }

       //pop to delete the element
       int pop(){
           if(index==0){
               System.out.println("empty array!");
               return -1;
           }
           int top=arr[index-1];
           arr[index-1]=0;
           index--;
           return top;
       }

       //display the stack in the form of stack
       void display(){
           for (int i = 0; i <=index-1 ; i++) {
               System.out.println(arr[i]);
           }
           System.out.println();
       }

       //calculate the size
       int size(){
            return index ;
       }
       //is empty
       boolean isEmpty(){
            if (index==0){
                return true;
            }
            else return false;
       }

       //if array full
       boolean isFull(){
            if (index==arr.length) return true;
           else return false;
       }

       //check the capacity
       int capacity(){
            return arr.length;
       }
   }

    public static void main(String[] args) {
        Stack st = new Stack();//we will create class for it .we will not import stack.
        st.push(2);
        st.display(); //2
        st.push(12);
        st.display(); //2 ,12
        st.push(123);
        st.display(); //2,12,123
        st.push(111);
        st.display(); //2,12,123,111
        System.out.println(st.size()); //4


        st.pop();
        st.display(); //2,12,123
        System.out.println(st.size()); //3


        st.push(15);
        System.out.println(st.isFull()); //true

        st.push(11);//stack si full

        System.out.println(st.capacity()); //4

    }
}

