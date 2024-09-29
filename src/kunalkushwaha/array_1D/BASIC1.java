package kunalkushwaha.array;

public class BASIC1 {
    public static void main(String[] args) {
       // int roll=10;//this is declaration of array

        int[] arr=new int[5];
        //this is declartion of array
        // int[] arr

        //initialisation of array
        //new int[5];   //here the new object will also be created in the heap are
        ////here in the heap area memory is not continuos in nature its depemdds on the JVM
        System.out.println(arr[0]);

        //for int array all value will be zero if not inserted anything in the array


        ///-------------------------------------------------------------------
        String[] arr1=new String[5];
        System.out.println(arr1[0]);
        //for String array all value will be null if not inserted anything in the array


    }
}
