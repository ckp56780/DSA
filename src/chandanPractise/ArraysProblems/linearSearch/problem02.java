package chandanPractise.ArraysProblems.linearSearch;

import java.util.Arrays;

//Input:
//arr = [5, 8, 9, 22, 30]
//target = 100
//
//Output:
//Element not found
public class problem02 {
    public static void main(String[] args) {
        int[] arr={5, 8, 9, 22, 30};
        int target=5;

        //calling the function here
        int[] ans=LinearSearch(arr,target);
      //  System.out.println(ans); //we cant do like this
        System.out.println(Arrays.toString(ans));

    }



    private static int[] LinearSearch(int[] arr, int target) {

        if (arr.length==0){
            return new int[]{-1};
        }
        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if (arr[i]==target){
                return new int[]{i};
            }

        }
        return new int[]{-1};

    }
}
