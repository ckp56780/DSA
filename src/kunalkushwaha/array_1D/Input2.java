package kunalkushwaha.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        int[] arr=new int[5];
        Scanner sc =new Scanner(System.in);

        //take input into the loop
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 34, 4, 5]
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[5]);
        //it will throw the exception indexOutOfBoundException
    }
}
