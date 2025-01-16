package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashSet;

public class RemoveDuplicateFromUnSortedArray_3_Print_WithHashset {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 3,2, 4, 4, 5, 6, 7};
        HashSet<Integer> hs=new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            hs.add(arr[i]);
        }

        //traditional for loop
        //convert hashset to array
        Integer[] uniqueElements = hs.toArray(new Integer[0]);
        // Iterate through the array using a traditional for loop
        for (int j = 0; j < uniqueElements.length; j++) {
            System.out.print(uniqueElements[j] + " ");
        }

        //enhanced for loop
//        for(int num:hs){
//            System.out.print(num +" ");
//        }

        }
}
