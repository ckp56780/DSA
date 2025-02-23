package chandanPractise.ArraysProblems.basicQuestionForInterview;

//find the missing number in the array.
//method-01---by summation
public class FindTheMissingNumber_19 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9,10};

        int expected_no_of_element=arr.length+1;
        int expected_total_sum=expected_no_of_element*(expected_no_of_element+1)/2;
        System.out.println(expected_total_sum);

        int Actual_sum=0;
        for (int i = 0; i <arr.length ; i++) {
            Actual_sum=Actual_sum+arr[i];
        }
        System.out.println("missing no is:" +" " +(expected_total_sum-Actual_sum));
    }
}
