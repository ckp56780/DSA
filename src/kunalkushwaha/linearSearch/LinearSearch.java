package kunalkushwaha.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,12,13,14,19,-4,15,20};
        int target=20;

        //calling the function
        int ans=linearSearch(arr,target);
        System.out.println(ans);

    }
    public static int linearSearch(int[] nums ,int target){
        if(nums.length==0){
            return -1;
        }

        for(int element:nums){
            if(element==target){
                return element;
            }
        }
        return -1;
//        for ( int index=0;index<nums.length;index++){
//            int element=nums[index];  //here we will find the value at given index
//            if(element==target){
//                return nums[index];//index //element
//            }
//        }
//        return -1;

    }


}
