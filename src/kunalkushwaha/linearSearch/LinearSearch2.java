package kunalkushwaha.linearSearch;

public class LinearSearch2 {
    //get true and false value  if element found or not?
    public static void main(String[] args) {

        int[] arr={12,13,14,15,16,17};
        int target=16;
       boolean ans= linearSearch(arr,target);
        System.out.println(ans);

    }

    public static boolean linearSearch(int[] arr1,int target){
        if(arr1.length==0){
            return false;
        }
        for(int element:arr1){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
