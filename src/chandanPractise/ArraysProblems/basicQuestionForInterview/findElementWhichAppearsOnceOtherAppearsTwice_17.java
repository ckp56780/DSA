package chandanPractise.ArraysProblems.basicQuestionForInterview;


//find the element in an array which will appears once and other appears twice
//logic will be the XOR-it is having 1.associate laws and 2.commutative laws follows
//i.e=Commutative= a+b=b+a , ab=ba
//associative=a+(b+c)=c+(a+b)
//it is denoted by "^"
public class findElementWhichAppearsOnceOtherAppearsTwice_17 {
    public static void main(String[] args) {
        int[] arr={1,2,4,1,4,3,3,6,7,6,8,7,8};



        int res=arr[0];
        for (int i = 1; i <arr.length ; i++) {

            res=res^arr[i];

        }
        System.out.println("The element which appears once in the array will be"+" "+res);
    }
}
