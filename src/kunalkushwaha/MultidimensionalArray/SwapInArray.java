package kunalkushwaha.MultidimensionalArray;

import java.util.Arrays;
//write a program to swap of element at given array
public class SwapInArray {
    public static void main(String[] args) {
        int[] arr={12,13,14,15,16,17};

        //calling the fucntion
        swap(arr,0,5);
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] arr,int firstIndex, int secondIndex){
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]= temp;
    }
}
