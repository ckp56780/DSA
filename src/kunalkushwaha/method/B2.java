package kunalkushwaha.method;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        add1();
        //add1();
        //add1();
        //add1();
        //we can write this multiple time to do task but also it not a good way

    }


    //method
    public static void add1(){
        Scanner sc =new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number1:");
        num1= sc.nextInt();

        System.out.println("Enter num2:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum is Equal to:"+sum);
    }
}
