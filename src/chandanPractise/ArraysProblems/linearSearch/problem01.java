package chandanPractise.ArraysProblems.linearSearch;
//Problem: Linear Search in an Array
//Write a Java program to implement a linear search algorithm. The program should search for a target element in a given array of integers. If the target element is found, the program should return the index of the element. If the target is not found, return -1.
//
//Problem Statement:
//You are given an array of integers and a target value.
//You need to find the index of the target value using a linear search algorithm.
//If the target is found, print the index. If the target is not found, return -1.

//Input:
//arr = [10, 24, 35, 48, 15]
//target = 35
//
//Output:
//Element found at index 2

import kunalkushwaha.linearSearch.LinearSearch;

public class problem01 {

    public static void main(String[] args) {

        int[] arr = {10, 24, 35, 48, 15};
        int target=35;

        //calling the function here:
        int ans=LinearSearch01(arr,target);
        System.out.println(ans);

    }

     static  int LinearSearch01(int[] arr1, int target){
        if (arr1.length==0){
            return -1;
        }
         for (int i = 0; i <arr1.length ; i++) {
             int element=arr1[i];
             if (arr1[i]==target){
                 return i;
             }
         }
             return -1;
         }




}
