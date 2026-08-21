package chandanPractise.ArraysProblems.linearSearch_01;

public class find_target_in_liniearsearch_trueFalse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=3;
        boolean b = linearserachwhichreturntrueFalse(arr, target);
        System.out.println(b);
    }


    public static boolean linearserachwhichreturntrueFalse(int[] arr1, int target) {
        if (arr1.length == 0) {
            return false;

        }
        for (int i = 0; i < arr1.length; i++) {
            int element = arr1[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
