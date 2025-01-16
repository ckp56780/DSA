package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.Arrays;

public class Find_the_largest_element_inArray {
    public static void main(String[] args) {
        int[] arr={10,21,22,111,123,143,1110};
        //calling function
        System.out.println(Max(arr));
    }
    private static int Max(int[] arr){
        int MaxNum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>MaxNum){
                MaxNum=arr[i];
            }
        }
        return MaxNum;
    }
}
