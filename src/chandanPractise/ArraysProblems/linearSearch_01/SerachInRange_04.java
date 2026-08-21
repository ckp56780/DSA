package chandanPractise.ArraysProblems.linearSearch_01;

public class SerachInRange_04 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=8;

        int i = searchInRANGE(arr, target, 2, 5);
        System.out.println(i);
    }
    public static int searchInRANGE(int[] arr, int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            int element=arr[i];
            if (element==target){
                //return target;//here we are returning the value
                return i;//here we are returning the index where target exists
            }

        }
        return -1;
    }
}
