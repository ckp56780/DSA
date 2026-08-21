package kunalkushwaha.array_03.ImportantQuestion_VVI_04_01;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class smallest_letter_greater_than_Target_03 {
    public static void main(String[] args) {
        char[] letters={'i','j','k','l'};
        char target='k';
        char c = nextCharacterElement(letters, target);
        System.out.println(c);
    }
    public static char nextCharacterElement(char[] letters,char target){

        int start=0;
        int end=letters.length-1;

        while (start<=end){
            //find the middle element
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}
