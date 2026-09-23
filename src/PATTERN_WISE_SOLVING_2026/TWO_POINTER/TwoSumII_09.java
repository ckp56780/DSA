package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
//TC-O(N)
//SC-O(1)
public class TwoSumII_09 {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;

        int[] ints = twoSum(numbers, target); //
        System.out.println(Arrays.toString(ints)); //[1, 2]
    }


    public static int[] twoSum(int[] numbers, int target) {
            int i=0;
            int j=numbers.length-1;
            while(i<j){
                int sum=numbers[i]+numbers[j];
                if(sum<target){
                    i=i+1;
                }else if(sum>target){
                    j=j-1;
                }else{
                    return new int[] {
                            i+1, //returning  the same+1 position
                            j+1 //returning  the same+1 position
                    };
                }

            }
            return new int[]{
                    -1,-1
            };
        }

}
