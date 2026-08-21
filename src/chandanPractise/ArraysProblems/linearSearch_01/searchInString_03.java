package chandanPractise.ArraysProblems.linearSearch_01;

public class searchInString_03 {
    public static void main(String[] args) {
        String str="chandan";
        char target='n';

        System.out.println(stringSearchIs(str,target));
    }


    public static boolean stringSearchIs(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }

        }
        return false;

    }
}
