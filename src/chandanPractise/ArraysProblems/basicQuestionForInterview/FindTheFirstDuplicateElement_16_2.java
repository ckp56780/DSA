package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashSet;

public class FindTheFirstDuplicateElement_16_2 {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2,3,6};

        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            if (hs.contains(arr[i])){
                temp=i;
            }else {
                hs.add(arr[i]);
            }
        }
        if (temp!=-1){
            System.out.println("First repeated element will be "+" "+arr[temp]);
        }else {
            System.out.println("First repeated element will be ");
        }
    }
}
