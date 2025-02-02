package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class FindTheFirstDuplicateElement_16 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2,3,6};

        //for outer loop
        for (int i = 0; i <arr.length-1 ; i++) {
            //for inner loop which start from index =1

            //initialise temp variable
            int temp=0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j] && i!=j){
                    System.out.println("the first repeating element will be"+" "+arr[i]);
                    temp=temp+1;
                    break;
                }

            }
            if (temp>0){
                break;

            }

        }
    }
}
