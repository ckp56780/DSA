package kunalkushwaha.LastCyclicSort;
//287. Find the Duplicate Number
//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;

public class Find_The_DuplicateNumber {
    public static void main(String[] args) {
        Find_The_DuplicateNumber finder = new Find_The_DuplicateNumber();

        // Test case
        int[] arr = {3, 1, 3, 4, 2};
        int duplicate = finder.findDuplicate(arr);

        System.out.println("The duplicate number is: " + duplicate);
    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    private void swap(int[] arr1, int first, int second) {
        int temp = arr1[first];
        arr1[first] = arr1[second];
        arr1[second] = temp;
    }
}
