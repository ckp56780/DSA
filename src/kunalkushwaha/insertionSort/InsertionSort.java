package kunalkushwaha.insertionSort;

import java.util.Arrays;

public class InsertionSort {


    public static void main(String[] args) {
       // int[] arr={5,3,4,1,2};
        int[] arr={0,-23,12,1,213};
        //calling the method here
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr1) {
        for (int i = 0; i <arr1.length-1 ; i++) {
            for (int j = i+1; j>0 ; j--) {
                if (arr1[j]<arr1[j-1]){
                    swap(arr1,j,j-1);
                }else {
                    break;
                }
            }

        }
    }
//creating the swap method:
    private static void swap(int[] arr1, int second, int first ) {
        int temp=arr1[first];
        arr1[first]=arr1[second];
        arr1[second]=temp;
    }


}
