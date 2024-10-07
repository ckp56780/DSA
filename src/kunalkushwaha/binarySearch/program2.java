package kunalkushwaha.binarySearch;
//This is for the OrderAgnostic binary search problem
public class program2 {
    public static void main(String[] args) {
       // int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int[] arr={98,97,45,33,23,12,11,9,1,0};
        int target=98;


        //calling the method here
        int ans=OrderAgnosticBinarySearch(arr ,target);
        System.out.println(ans);
    }



    static int OrderAgnosticBinarySearch(int[] arr1, int target) {
        int start = 0;
        int end = arr1.length - 1;

        //find weather the array is sorted into ascending and descending

        boolean isAsc = arr1[start] < arr1[end];

        //or
//        boolean isAsc;
//        if(arr1[start]<arr1[end]){
//            isAsc=true;
//        }else {
//            isAsc=false;
//        }

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;


            if (arr1[mid] == target) {
                return mid;
            }


            if (isAsc) {
                //for left side
                if (target < arr1[mid]) {
                    end = mid - 1;
                }
                //for right side
                else {
                    start = mid + 1;
                }

            } else {
                //for left side
                if (target > arr1[mid]) {
                    end = mid - 1;
                }
                //for right side
                else {
                    start = mid + 1;
                }

            }

        }
        return -1;

    }
}

