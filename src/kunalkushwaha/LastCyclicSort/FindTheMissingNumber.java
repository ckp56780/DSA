package kunalkushwaha.LastCyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindTheMissingNumber finder = new FindTheMissingNumber();

        List<Integer> missingNumbers = finder.findDisappearedNumbers(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
        System.out.println("Missing Numbers: " + missingNumbers);
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // Correct index for the current number
            // Ensure the current number is within the valid range and not in the correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // Find the missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1); // Index + 1 is the missing number
            }
        }
        return ans;
    }

    static void swap(int[] arr1, int first, int second) {
        int temp = arr1[first];
        arr1[first] = arr1[second];
        arr1[second] = temp;
    }
}
