package kunalkushwaha.MultidimensionalArray;
//write  a program to find the max value in the given array
public class MaxValue {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,221};

        //to get the max value in the given array
        System.out.println(max(arr));
        //to get the max value in the given initial index and last index
        System.out.println(max1(arr,0,4));
    }

    private static int max(int[] arr) {

        //you can define here the age cases--


        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) { //start compare after index 1
            if (arr[i]>maxValue){//where arr[i] -defind as alike to get each value
                maxValue=arr[i];

            }
        }
        return maxValue;
    }

    //find the max value in the given range

    private static int max1(int[] arr ,int startIndex,int endIndex) {
        int maxValue=arr[0];
        for (int i = startIndex; i <=endIndex ; i++) {

            if (arr[i]>maxValue){//where arr[i] -defind as alike to get each value
                maxValue=arr[i];

            }
        }
        return maxValue;
    }


}
