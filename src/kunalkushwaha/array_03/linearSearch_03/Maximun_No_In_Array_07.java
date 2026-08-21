package kunalkushwaha.array_03.linearSearch_03;

public class Maximun_No_In_Array_07 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 1, 2, 71, 123};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        return ans;
    }
}
