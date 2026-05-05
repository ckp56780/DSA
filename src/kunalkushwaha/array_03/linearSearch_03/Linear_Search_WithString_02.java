package kunalkushwaha.array_03.linearSearch_03;

public class Linear_Search_WithString_02 {
    public static void main(String[] args) {

        String str="chandan";
        char target='c';

        //calling the function for finding the char "d" int the string

        boolean ans=linearWithString(str,target);
        System.out.println(ans);
    }
    public static boolean linearWithString(String str1, char target){
//        if(str1.length()==0){
//            return false;
//        }
        for(int i=0;i<str1.length();i++){
            char element=str1.charAt(i);
            if(element==target){
                return  true;
            }
        }
        return false;

    }
}
