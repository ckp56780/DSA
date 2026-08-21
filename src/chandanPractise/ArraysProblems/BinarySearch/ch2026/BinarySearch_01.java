package chandanPractise.ArraysProblems.BinarySearch.ch2026;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,3,45,54,78,90};
        int target=-1;
        int found = binarySearch_01(arr, target);
        System.out.println(found);
    }


    //create the method
    private static int binarySearch_01(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return -1;

    }
}
