package chandanPractise.ArraysProblems.BinarySearch.ch2026;

public class OrderAgnosticBS_02 {
    public static void main(String[] args) {
//        int[] arr={-1,0,1,2,45,67,87,90};
        int[] arr={99,98,50,45,33,11,9,0,1,-1};
        int target=-1;
        int orderABs = orderA_BS(arr, target);
        System.out.println(orderABs);
    }

    private static int orderA_BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check the array is inc/dec
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        //then now check the condition
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
