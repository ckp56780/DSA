package kunalkushwaha.recursion.learningByKunal;

//1.problem01:starting
public class message {
    //q.1.print the hello world by calling a single function/method
    public static void main(String[] args) {

        //calling the function here
        message();
//        message1();
//        message2();
//        message3();
//        message4(); //but above is not best pratise
    }
    public static void message(){
        System.out.println("hello world!");
        message1();
        //suppose we want to print message alot of time
    }
    public static void message1(){
        System.out.println("hello world!");
        message2();
    }
    public static void message2(){
        System.out.println("hello world!");
        message3();
    }
    public static void message3(){
        System.out.println("hello world!");
        message4();
    }
    public static void message4(){
        System.out.println("hello world!");

    }
}

