package kunalkushwaha.recursion.learningByKunal;
//4.problem04:fibonachi number by recursion
public class FibonachiNumber_L4 {
    public static void main(String[] args) {

        System.out.println(fibo(3));

    }
    public static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
}
