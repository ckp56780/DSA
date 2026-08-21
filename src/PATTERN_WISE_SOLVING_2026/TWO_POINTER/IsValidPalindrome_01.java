package PATTERN_WISE_SOLVING_2026.TWO_POINTER;
//https://leetcode.com/problems/valid-palindrome/description/
//T.C=O(n)
//S.C=O(1)
public class IsValidPalindrome_01 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<j){

            char left=s.charAt(i);
            char right=s.charAt(j);
            //first need to check the non-alpha numeric character
            if(!Character.isLetterOrDigit(left)){
                i=i+1;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j=j-1;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i=i+1;
            j=j-1;
        }
        return true;

    }
}
