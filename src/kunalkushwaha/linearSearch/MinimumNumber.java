package kunalkushwaha.linearSearch;
//find the minimum number into the array
//first take index 0 is min and then compare rest which index start from the 1
public class MinimumNumber {
    public static void main(String[] args) {

        int[] arr = {18, 12, 7, 3, 14, 28};

        System.out.println(minimunNumber(arr));
    }

    public static int minimunNumber(int[] arr1) {
        //assume that array is not empty
        //finding the min number in the array
        int ans = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < ans) {
                ans = arr1[i];//update the answer
            }
        }
        return ans;
    }
}
