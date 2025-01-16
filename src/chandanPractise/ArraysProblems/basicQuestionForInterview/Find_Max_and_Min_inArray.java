package chandanPractise.ArraysProblems.basicQuestionForInterview;

public class Find_Max_and_Min_inArray {
    public static void main(String[] args) {
        int[] arr={10,21,22,111,123,143,1110};
        int maxNum=arr[0];
        int minNum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maxNum){
                maxNum=arr[i];
            } else if (arr[i]<minNum) {
                minNum=arr[i];
            }

        }
        System.out.println("Max num is: "+maxNum+ "  " +"Min number is: "+minNum);
    }

}
