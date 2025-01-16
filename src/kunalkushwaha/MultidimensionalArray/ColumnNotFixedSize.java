package kunalkushwaha.MultidimensionalArray;

import java.util.Arrays;

public class ColumnNotFixedSize {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6},
                {7,8,9,10}

        };

        //traditional way to print
//        for (int row = 0; row <arr.length ; row++) {
//            for (int column = 0; column <arr[row].length ; column++) {
//                System.out.print(arr[row][column]+  " ");
//            }
//            System.out.println();
//
//        }

        //enhanced for loop
        for (int[] element: arr) {  //int[] each element into the array:ref variable
            System.out.println(Arrays.toString(element));

        }
    }
}
