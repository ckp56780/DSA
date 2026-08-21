package kunalkushwaha.array_03.ImportantQuestion_VVI_04_01;

public class floor_Of_Number_02 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;


        //calling the method
        //return the index of greatest no which is <=target
        int ans=floorofnumber(arr,target);
        System.out.println(ans);


    }

    //if arrays is empty return -1

    static int floorofnumber(int[] arr1, int target){

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
        return end;
    }
}
