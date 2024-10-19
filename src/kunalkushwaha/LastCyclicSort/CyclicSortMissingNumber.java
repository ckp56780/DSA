package kunalkushwaha.LastCyclicSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSortMissingNumber {
    //https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=sorting
//Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        //calling the function

        System.out.println("Array after sorting:"+Arrays.toString(arr));
        int missingNum = missingNumber(arr);
        System.out.println(missingNum);
    }

    private static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }

        }
        //case-2
        return arr.length;

    }


    static void swap(int[] arr1, int first, int second) {
        int temp = arr1[first];
        arr1[first] = arr1[second];
        arr1[second] = temp;
    }

}
