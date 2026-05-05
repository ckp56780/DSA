package kunalkushwaha.array_03.OneDimensional_array_01;

import java.util.Arrays;
import java.util.Scanner;

public class Input_02 {
    public static void main(String[] args) {

        int[] arr=new int[5];

//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        System.out.println(arr[4]);//5

        Scanner sc =new Scanner(System.in);

        //take input into the loop
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println(arr[5]);
        //it will throw the exception indexOutOfBoundException
    }
}
