package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class secondSmallestElementInTheArray {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,6,7,8};

        int temp;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //sort into the descending order
        //print an element
        for (int i= 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After sorted and 2nd smallest element will be:"+arr[1]);
    }

}

