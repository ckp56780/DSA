package kunalkushwaha.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {

    int[] arr = {18, 12, -7, 3, 14, 28};
    int target=28;
    int start;
    int end;
    //calling the method
       int ans= searchInRange(arr, target, 1,4);
        System.out.println(ans);

}

 public static int searchInRange(int[] arr1,int target,int start,int end){
        if(arr1.length==0){
            return -1;
        }
        for (int index=start;index<=end;index++){
            int number1=arr1[index];
            if(arr1[index]==target){
                return index;//number1//index;
            }
        }
        return -1;


 }
}
