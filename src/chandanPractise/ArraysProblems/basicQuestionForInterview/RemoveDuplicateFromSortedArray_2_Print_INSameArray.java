package chandanPractise.ArraysProblems.basicQuestionForInterview;
//write a program to remove the duplicate element from a sorted array
// and store into the same array without creating a new temp array.
public class RemoveDuplicateFromSortedArray_2_Print_INSameArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 6, 7};

        //traverse on the loop
        //initialize a j variable
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }


        }
        arr[j] = arr[arr.length - 1];
        for (int i= 0; i< j+1; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
