package chandanPractise.ArraysProblems.basicQuestionForInterview;


import java.util.HashSet;

//the belwo program will work whe the no any duplicate found in nay given two array
public class FindTheCommonElementFromTwoArray_20 {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,10};   //1,1,4,10 --if duplicate found
        int[] arr2={1,5,4,6,9,10};

        //use hashset
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    //System.out.println("common element will be " +arr2[j]);
                    hs.add(arr1[i]);
                }

            }

        }
        //iterate element from hashset
        for(int number:hs){
            System.out.println(number);
        }

    }
}
