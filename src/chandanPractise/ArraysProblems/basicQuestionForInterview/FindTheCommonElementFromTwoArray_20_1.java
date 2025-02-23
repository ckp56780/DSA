package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashSet;

//both the array element should be unique.
public class FindTheCommonElementFromTwoArray_20_1 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,10};   
        int[] arr2={1,5,4,6,9,10};

        HashSet<Integer> hs=new HashSet<>();
        
        for (int no:arr1){
            hs.add(no);
        }
        for (int no:arr2){
            boolean b = hs.add(no);
            if (b==false){
                System.out.println("this is common no:"+no);
            }
        }
        
    }
}
