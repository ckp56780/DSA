package chandanPractise.ArraysProblems.basicQuestionForInterview;
//method-02-here we can find the missing number from the XOR rule
//(1^2^3^4^6) ^(1^2^3^4^5^6)
//(1^1)^(2^2)^(3^3)^(4^4)^(6^6)^5
//0 ^    0   ^   0 ^  0  ^  0  ^ 5
// 0^5=5
public class FindTheMissingNumber_19_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9,10};

        int Xor1=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            Xor1=Xor1^arr[i];
        }

        int Xor2=1;
        for (int i = 2; i <=(arr.length+1) ; i++) {
            Xor2=Xor2^i;
        }
        System.out.println("find the missing number is:" +" " +(Xor1^Xor2));
    }
}
