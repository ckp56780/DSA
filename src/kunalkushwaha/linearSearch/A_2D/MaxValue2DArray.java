package kunalkushwaha.linearSearch.A_2D;

public class MaxValue2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {21, 23, 12, 16, 19},
                {112, 81, 90, 900, 123}
        };

        // Calling the function
        int ans = max(arr);
        System.out.println("Maximum value in the 2D array is: " + ans);
    }

    public static int max(int[][] arr1) {
        if (arr1.length == 0) {
            return -1; // Return -1 for an empty array
        }

        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer

        // Iterate through each row
        for (int row = 0; row < arr1.length; row++) {
            // Iterate through each column in the current row
            for (int col = 0; col < arr1[row].length; col++) {
                // Update max if a larger value is found
                if (arr1[row][col] > max) {
                    max = arr1[row][col];
                }
            }
        }

        return max; // Return the maximum value found
    }
}
