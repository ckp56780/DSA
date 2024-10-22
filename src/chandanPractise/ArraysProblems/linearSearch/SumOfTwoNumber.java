package chandanPractise.ArraysProblems.linearSearch;

import java.util.Arrays;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=9;

        //calling the function here
        int[] ans=SumOfTwoNumber01(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] SumOfTwoNumber01(int[] arr1, int target) {
        if (arr1.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i <arr1.length ; i++) {
            int element1=arr1[i];
            for (int j = 0; j <arr1.length ; j++) {
                int element2=arr1[j];
                if(element1+element2==target){
                    return new int[] {i,j};
                }

            }

        }
        return new int[]{-1,-1};

    }
}
