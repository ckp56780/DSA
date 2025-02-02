package chandanPractise.ArraysProblems.basicQuestionForInterview;
//program is to find the duplicate element from an array
//this is brute force approach-but it will take more time.if one number appears more
//than 2 times it will repeat that element to print
public class find_the_duplicate_of_Array {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,3,4,5,6,7,8,9,10,10};

        duplicate(arr);
    }

    private static void duplicate(int[] arr){ //we can use int[] then reutrn should be  return arr
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("find the duplicate element:" +arr[i]);  //if you use [arr then u get [I@eed1f14   ]
                }

            }

        }
        //the time complexity of this logic - O of n square --this is the brute force solution
        //we can also done with hashset


    }
}
