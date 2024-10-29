package kunalkushwaha.recursion.learningByKunal;
//2.problem02:starting:write a fucntion to print the function till 1 to 5.
public class number {
    public static void main(String[] args) {
        number(1);
    }
    public  static void number(int n){
        System.out.println(n);
        number2(2);
    }
    public  static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    public  static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    public  static void number4(int n){
        System.out.println(n);
        number5(5);
    }
    public  static void number5(int n){
        System.out.println(n);
    }

}
