package kunalkushwaha.linearSearch;
//this program will be for getting then true if not get false
public class SearchInRange2 {
    public static void main(String[] args) {

        int[] arr = {18, 12, -7, 3, 14, 28};
        int target=12;
        int start;
        int end;
        //calling the method
        //boolean ans= searchInRange(arr, target, 1,4);
        System.out.println(searchInRange(arr, target, 1,4));

    }

    public static boolean searchInRange(int[] arr1,int target,int start,int end){
        if(arr1.length==0){
            return false;
        }
        for (int index=start;index<=end;index++){
            int number1=arr1[index];
            if(arr1[index]==target){
                return true;//number1//index;
            }
        }
        return false;

    }
}
