package chandanPractise.ArraysProblems.bubblesort;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {


        int[] arr={3,2,4,1,5};
        //calling the function
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //method
    static  void bubbleSort(int[] arr){
        boolean swapped;
        //run the first for i loop
        for(int i=0;i< arr.length;i++){


            //if not sorted-
            swapped =false;
            //run the second loop for j
            for (int j=1;j< arr.length-i;j++){
                //make the condition
                if(arr[j]<arr[j-1]){
                    //then swap the Element
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
