package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class Min_NumberintheArray {
    public static void main(String[] args) {

        int[] arr = {10, 21, 22, 111, 123, 143, 1110};

        //calling function
        System.out.println(Max(arr));
    }

    private static int Max(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;

    }
}
