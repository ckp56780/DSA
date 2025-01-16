package chandanPractise.ArraysProblems.basicQuestionForInterview;
///vvi-remove the duplicate element from an sorted array
public class RemoveDuplicateFromSortedArray1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,6,7};
        //where int a=arr.length=length of array
        //int a=arr.length;

        //created a temp array to insert without duplicate value
        int[] temp=new int[arr.length];

        int j=0;
        for (int i = 0; i <arr.length-1 ; i++) {

            //checking the condition

            if (arr[i]!=arr[i+1]){
                temp[j]=arr[i];  //jisme value put karna hai usko pahle likhna hoga
                j++;
            }
        }
        temp[j]=arr[arr.length-1]; //where a=arr.length;
        for (int i = 0; i <temp.length ; i++) {

            System.out.println(temp[i]+ " ");
        }

    }
}
