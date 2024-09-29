package pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("given the input number:");
        int n=sc.nextInt();
        Pattern3(n);
        //sc.close();//this is optional
    }
    public static  void Pattern3(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
}
