package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.Arrays;
//https://leetcode.com/problems/reverse-string/
//TC-O(N)
//SC-O(1)
public class ReverseCharacterStringInArray_02 {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};

        reverseStringArray(s);
        System.out.println(Arrays.toString(s));

    }

    public static void reverseStringArray(char[] s){
        int i=0,
            j=s.length-1;  //THIS WAY WE CAN DEFINE THE VARIABLE

        //or
//        int i=0;
//        int j=s.length-1;

        while (i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i=i+1;
            j=j-1;
        }

    }
}
