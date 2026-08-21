package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
//mast question hai
//tc=O(M+N)
//SC-O(1)
public class Merge_Sorted_Array_06 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1)); //we are printing nums1 bcs we are mering into nums1 only so

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;  //or i=i-1;
            }else{
                nums1[k]=nums2[j];
                j--; //j=j-1;
            }
            k--; //k=k-1;

        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--; //k=k-1;
            j--; //j=j-1;
        }

    }

}
