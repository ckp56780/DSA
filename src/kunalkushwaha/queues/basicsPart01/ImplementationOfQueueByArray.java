package kunalkushwaha.queues.basicsPart01;
//part-03
public class ImplementationOfQueueByArray {
    //create the Implementation class for queue
    public static class queueImplementation{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[5];

        //create the add method:-
        public void add(int val){
            //full rear is touch till end then it will throw error/full
            if (r==arr.length-1){
                System.out.println("size is of array is getting full");
                return;
            }
            //base case
            if (f==-1){
                f=r=0;
                arr[0]=val;
            }else {
                arr[r+1]=val;
                r++;
            }
            size++;
        }
        //remove function
        public int removeElement(){
            if (size==0){
                System.out.println("empty array");
                return -1;
            }

            int x=arr[f];
            f++;
            size--;
            return x;
        }
        //peek function
        public int peekF(){
            if (size==0){
                System.out.println("empty array");
                return -1;
            }

            //peek and return index
             return arr[f];
        }

        //is Empty
        public  boolean isEmptyArray(){
            if (size==0) return  true;
            else return false;
            }

            //display function
        public void displayA(){
            if (size==0){
                System.out.println("array is empty");
            }else {
                for (int i = f; i <=r ; i++) {
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();

        }


    }
    public static void main(String[] args) {
        queueImplementation q=new queueImplementation();
        q.displayA(); //array is empty
        //add
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.displayA(); //1 2 3 4

        q.removeElement();
        q.displayA();  //2 3 4

        //find top element in queue
        System.out.println(q.peekF());//2
        System.out.println(q.size); //3





    }

}

