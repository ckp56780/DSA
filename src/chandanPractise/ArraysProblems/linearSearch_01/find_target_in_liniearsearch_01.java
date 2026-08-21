package chandanPractise.ArraysProblems.linearSearch_01;

public class find_target_in_liniearsearch_01 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=3;
        int i = linearSearch(arr, target);
        System.out.println(i);

    }

    public static int linearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
//                return element; or
                return i;
            }
        }
//        return target;
         return -1;
    }

}

