package kunalkushwaha.array_03.ImportantQuestion_VVI_04_01;

import java.util.Arrays;

public class FirstAndLastPostionOfElement_04 {
    public static void main(String[] args) {



        FirstAndLastPostionOfElement_04 obj = new FirstAndLastPostionOfElement_04();

        // Example array (sorted)
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("First and Last Position of " + target + " is: " + Arrays.toString(result));

        // Try another test case
        int target2 = 6;
        int[] result2 = obj.searchRange(nums, target2);

        System.out.println("First and Last Position of " + target2 + " is: " + Arrays.toString(result2));
    }

    public int[] searchRange( int[] nums,int target) {

        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }

        // this function will return the only index value of target
        int search ( int[] nums, int target, boolean findStartIndex){
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;

            //check for first occurrence if target first
            while (start <= end) {
                //find the middle element
                int mid = start + (end - start) / 2;


                //for left side
                if (target < nums[mid]) {
                    end = mid - 1;
                }
                //for right side
                else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    //potential answer found
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
}