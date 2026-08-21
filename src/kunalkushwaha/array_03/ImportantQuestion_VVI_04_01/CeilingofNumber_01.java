package kunalkushwaha.array_03.ImportantQuestion_VVI_04_01;

public class CeilingofNumber_01 {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;


        //calling the method
        //return the index of smallest no which is >=target
        int ans=celingofnumber(arr,target);
        System.out.println(ans);


    }

    //if arrays is empty return -1

    static int celingofnumber(int[] arr1, int target){

        //but what if the target is greater than greatest no in the array
        if (target>=arr1[arr1.length-1]){
            return -1;
        }

        int start=0;
        int end= arr1.length-1;


        while(start<=end){
            //find the middle element
            int mid=start+ (end- start)/2;


            //for the left side
            if(target<arr1[mid]){
                end=mid-1;
            }
            //for the right side
            else if (target>arr1[mid]){
                start=mid+1;
            }
            else {
                //get the target element
                return mid;
            }
        }
        return start; //or arr1[start]
    }
}
