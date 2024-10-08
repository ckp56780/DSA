package chandanPractise.ArraysProblems;
//Problem Statement
//You are given a sorted array of integers and a target integer.
// Your task is to find the index of the target in the array using binary search. If the target is not found, return -1.
public class problem01 {
    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target=5;

        //calling the method:-
        int ans=returnTargetIndex(arr,target);
        System.out.println(ans);
    }

    //method here we will define for the build the logic
    //if array is an empty return the -1
    static int returnTargetIndex(int[] arr1, int target) {
        int start = 0;

        int end = arr1.length - 1;

        //all ready give that array is in sorted in ascending order
        while (start<=end){
           int mid=start+(end-start)/2;
           if(arr1[mid]==target){
               return mid;//which is target

           }
           else if(target<=arr1[mid]){
               return end=mid-1;
           }
           else {
               return start=mid+1;

           }
        }
       return -1;
    }



}
