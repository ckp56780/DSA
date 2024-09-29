package kunalkushwaha.MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        1 2 3
        2 3 4
        2 3 1
        3 row and 3 column
       */

        //syntax
        // int[][] arr=new int[3][];

        //or  //we can define this way also

        //int[][] arr={{  1 ,2, 3},{ 2, 3 ,4},{ 2, 3 ,1}};
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
                //System.out.println(Arrays.toString(arr[row]));
               System.out.print(arr[row][col] + " ");
            }
            System.out.println();


        }
    }
}
