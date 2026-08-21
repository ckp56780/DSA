package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/2111438474/
//Time Complexity : O(n)
//Space Complexity : O(n)
public class Square_of_Sorted_Array_04 {
    public static void main(String[] args) {
       int[] nums = {-4,-1,0,3,10};
        int[] ints = sortedSquares(nums);
        System.out.println(Arrays.toString(ints));

    }
    public static int[] sortedSquares(int[] nums) {
        //defining the length
        int n=nums.length;

        int[] result=new int[n];

        //define the pointer
        int left=0;
        int right=n-1;
        int index=n-1;

        //running the while loop
        while(left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
                result[index]=leftSquare;
                left++;
            }else{
                result[index]=rightSquare;
                right--;
            }
            index--;

        }
        return result;

    }
}
