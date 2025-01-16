package kunalkushwaha.MultidimensionalArray;

import java.util.Arrays;

public class reverseOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        reverse(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int i1) {

        int start = 0;
        int end = arr.length - 1; //last index
        //arr.length=size;
        while (start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    private static void swap(int[] arr,int firstIndex, int secondIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]= temp;
    }



}
