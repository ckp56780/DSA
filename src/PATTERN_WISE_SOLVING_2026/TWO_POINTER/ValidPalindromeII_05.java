package PATTERN_WISE_SOLVING_2026.TWO_POINTER;
//tc-o(n)
//sc-O(1)
//https://leetcode.com/problems/valid-palindrome-ii/description/
public class ValidPalindromeII_05 {
    public static void main(String[] args) {

        String str="abbxa";
        boolean b = validPalindrome(str);
        System.out.println(b);
    }
    public static boolean validPalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while (i<j){
            char left=str.charAt(i);
            char right=str.charAt(j);
            if (left!=right){
                return palindromeHelper(i+1,j,str) ||palindromeHelper(i,j-1,str);
            }else {
                i=i+1;
                j=j-1;
            }
        }
        return true;
    }
    //create another method--
    public static   boolean palindromeHelper(int i,int j,String s){
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i=i+1;
            j=j-1;
        }
        return true;
    }
}
