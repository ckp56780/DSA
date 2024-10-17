package kunalkushwaha.LastCyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};

        //calling the function
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }

        }
    }

    static void swap(int[] arr1,int first,int second){
        int temp=arr1[first];
        arr1[first]=arr1[second];
        arr1[second]=temp;
    }
}
