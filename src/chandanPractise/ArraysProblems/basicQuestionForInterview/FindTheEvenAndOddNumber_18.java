package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.ArrayList;

public class FindTheEvenAndOddNumber_18 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};

        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                arrayList1.add(arr[i]);
            }
            else {
                arrayList2.add(arr[i]);
            }

        }
        int Total1=0;
        System.out.println("Even number is:");
        for(int number:arrayList1){
            Total1=Total1+number;
            System.out.print("  "+number);

        }
        System.out.println();
        System.out.println("size of even number is:" +" "+arrayList1.size());
        System.out.println("Total sum of even number:" +" " +Total1);




        int Total2=0;
        System.out.println();
        System.out.println("Odd number is:");
        for(int number:arrayList2){
            Total2=number+Total2;
            System.out.print(" "+number);

        }
        System.out.println();
        System.out.println("size of odd number is:"+" "+arrayList2.size());
        System.out.println("Total sum of odd number:" +" " +Total2);
    }
}
