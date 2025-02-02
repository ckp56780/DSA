package chandanPractise.ArraysProblems.basicQuestionForInterview;

import java.util.HashSet;
import java.util.Set;
//if we have inserted value in the array more than 2 times then again that program will
//print that repeated element which repeated more than 2 times.
public class IInd_FindTheBest_duplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10,10};

        duplicate(arr);
    }

    private static void duplicate(int[] arr) {
        Set<Integer> duplicateNum = new HashSet<>();
        for (int number : arr) {   //number is defind as each number of array
            if (!duplicateNum.add(number)) {  // not equal to add
                System.out.println("we got the duplicate number:" + number);

                //T.C WILL BE HERE AS-O OF N
            }
        }
    }
}

