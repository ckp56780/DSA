package kunalkushwaha.method;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        int ans=add3();
        System.out.println("output will be:"+" "+ans);
    }
    public static int add3(){
        Scanner sc =new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number1:");
        num1= sc.nextInt();

        System.out.println("Enter num2:");
        num2=sc.nextInt();
        sum=num1+num2;
        //System.out.println("sum is Equal to:"+sum);
        return sum;
    }
}
