package kunalkushwaha.method;

import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number1:");
        num1= sc.nextInt();

        System.out.println("Enter num2:");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("sum is Equal to:"+sum);

        //if we want to perform certain task multiple time then same procedure cant be possible
        //thtwhy we need method
    }
}
