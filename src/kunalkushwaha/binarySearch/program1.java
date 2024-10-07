package kunalkushwaha.binarySearch;

//program-01:find the target element with the help of binary search algorithm.
public class program1 {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=2;


        //calling the method
        int ans=BinarySearch(arr,target);
        System.out.println(ans);


    }

    //if arrays is empty return -1

    static int BinarySearch(int[] arr1, int target){
        int start=0;
        int end= arr1.length-1;


        while(start<=end){
            //find the middle element
            int mid=start+ (end- start)/2;


            //for left side
            if(target<arr1[mid]){
                end=mid-1;
            }
            //for right side
            else if (target>arr1[mid]){
                start=mid+1;
            }
            else {
                //get the target element
                return mid;
            }
        }
        return -1;
    }
}
