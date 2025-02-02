package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class secondLargestElementInTheArray2way {
    public static void main(String[] args) {
        int[] arr={12,111,223,114,453,321};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest=arr[i];
                
            }

        }
        if (secondLargest==Integer.MIN_VALUE){
            System.out.println("second largest is not found");
        }else {
            System.out.println("second largest is  found:" +" "+secondLargest);
        }
    }
}
