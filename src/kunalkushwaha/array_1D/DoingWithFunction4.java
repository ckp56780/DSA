package kunalkushwaha.array;

import java.util.Arrays;

public class DoingWithFunction4 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(Arrays.toString(arr));

        //calling the function
        change(arr);
        System.out.println(Arrays.toString(arr));
        //[10, 20, 30, 40]
        //[100, 20, 30, 40]
    }

    private static void change(int[] num) {
        num[0]=100;
    }
}
