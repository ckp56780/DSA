package kunalkushwaha.SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={2,-32,0,78,1};

        //calling the function
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selectionSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            //find the max element and swapped with its correct index.
            int last=arr.length-i-1;

            int maxIndex=getMaxIndex(arr,0,last);
            swapElement(arr,maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {

        int max=start;
        for (int i=start; i<=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swapElement(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }



}
