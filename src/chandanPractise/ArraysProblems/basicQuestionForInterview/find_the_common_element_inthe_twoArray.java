package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class find_the_common_element_inthe_twoArray {
    public static void main(String[] args) {
        int[] arr1={10,20,21,22,23,221};
        int[] arr2={10,210,21,212,23,221};
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    System.out.println("found the common element:" +arr2[j]); //u can use -arr1[i]
                }

            }

        }
    }
}
