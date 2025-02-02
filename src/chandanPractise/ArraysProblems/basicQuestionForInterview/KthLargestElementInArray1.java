package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class KthLargestElementInArray1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,112,32,332,123};

        //find the kth largest i.e=k=5;
        int k=5;
        int temp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            if (i==k-1){
                System.out.println("Kth largest element is :"+arr[i]);
                //break;   //we can use break,it will sort till 5th element
            }

        }
        //print an element
        System.out.println("............");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"  ");

        }
    }
}
