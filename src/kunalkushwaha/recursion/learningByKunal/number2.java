package kunalkushwaha.recursion.learningByKunal;
//3.problem03:starting:write a fucntion to print the function till 1 to 5.
public class number2 {
    public static void main(String[] args) {
        number(1);
    }
    public static void number(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
         System.out.println(n);
        number(n+1);
    }
}
