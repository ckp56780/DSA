package PATTERN_WISE_SOLVING_2026.TWO_POINTER;

import java.util.Arrays;

public class Valid_Palindrome_03 {
    public static void main(String[] args) {
        String str="LEVEL";
        System.out.println(validPalindrome(str));
    }

    public  static boolean validPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        char left=str.charAt(i);
        char right=str.charAt(j);
        while (i<j){
            //if (str.charAt(i)!=str.charAt(j)){
                //or
            if (left!=right){
                return false;
            }
            i=i+1;
            j=j-1;
        }
        return true;
    }
}
