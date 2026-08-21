package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//TC-O(n.logn)
//sc=O(longn)
//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
public class CountPairWhosSumIsLessThanTerget_07 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1));
        int target = 2;

        int result = countPairs(nums, target);
        System.out.println("Number of pairs = " + result);
    }
    public  static int countPairs(List<Integer> nums, int target){
        //first sort the List of array
        Collections.sort(nums);

        //then we will compare the number with target
        int i=0;
        //yaha per list of integer hai isliye size() method use hua
        int j=nums.size()-1;

        int count=0;
        while (i<j){
            int sum=nums.get(i)+nums.get(j);
            if (sum<target){
                count=count+(j-i);
                i=i+1;
            }else {
                j=j-1;
            }
        }
        return count;
    }
}
