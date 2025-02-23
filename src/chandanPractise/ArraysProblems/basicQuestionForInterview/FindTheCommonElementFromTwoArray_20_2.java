package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashSet;

//if both the array having duplicate element then, also we can find the common.
public class FindTheCommonElementFromTwoArray_20_2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,10,1};
        int[] arr2={1,5,4,6,9,10,9};
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();

        //adding array 1 into hs1
        for(int no:arr1){
            hs1.add(no);
        }
        //adding array 2 into hs2
        for(int no:arr2){
            hs2.add(no);
        }
        for (int no:arr2){
            if (hs1.contains(no)){
                System.out.println("that is common element:"  +" "+no);
            }

        }
    }
}
