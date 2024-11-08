package kunalkushwaha.queues.basicsPart02;
//p-5
public class CircularQueue_Implementation_ByArray {

    //create class of CircularQ_ByArray
    public static class CircularQ_ByArray{
        int front=-1;
        int rear=-1;
        int size=0;

        int[] arr=new int[6];
        //Add //x -which we want to add
        public void add(int x) throws Exception{
            if (size==arr.length){
                throw new Exception("Queue is full!!");
            }
            //base case
            else if (size==0) {
                front=rear=0;
                arr[0]=x;
            } else if (rear<arr.length-1) {
                rear++;
                arr[rear]=x;
            }
            else if (rear==arr.length-1){
                rear=0;
                arr[0]=x;
            }
            size++;

        }
        //create the remove function
        public int removeQ() throws Exception {
            if (size == 0) {
                throw  new Exception("queue is empty");
            } else {
                int val = arr[front];  //front nikal lo
                if (front == arr.length - 1)  front = 0;
                else front++;
                size--;
                return val;
            }

        }

        //peek
        public int peek1() throws Exception{
            if (size == 0) {
                throw  new Exception("queue is empty");
            } else return arr[front];
        }

        //is Empty
        public  boolean isEmptyArray(){
            if (size==0) return  true;
            else return false;
        }

        //display function
        public  void displayQ(){
            if (size==0 ){
                System.out.println("queue is empty ");
                return;
            }else if (front<=rear){
                for (int i = front; i <=rear ; i++) {
                    System.out.print(arr[i]+ " ");
                }
            } else{ //rear<front

                for (int i = front; i <arr.length ; i++) {
                    System.out.print(arr[i]+ " ");
                }
                for (int i = 0; i <=rear ; i++) {
                    System.out.print(arr[i]+ " ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args)  throws  Exception{
        CircularQ_ByArray circularQByArray=new CircularQ_ByArray();
        circularQByArray.displayQ();
        circularQByArray.add(1);
        circularQByArray.add(2);
        circularQByArray.add(3);
        circularQByArray.add(4);
        circularQByArray.add(5);
        circularQByArray.displayQ();

        //remove
//        circularQByArray.removeQ();
//        circularQByArray.displayQ();

        //add one more
        circularQByArray.add(21);
        circularQByArray.displayQ();//2 3 4 5 21

        circularQByArray.add(22);
        circularQByArray.displayQ();//Queue is full!!

    }
}
