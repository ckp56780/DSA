package pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        //int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input:");
        int n=sc.nextInt();
        pattern5(n);

    }
//    public static void pattern5(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
     public static void pattern5(int n) {
         for (int i = 1; i <= n; i++) {
             for (int j = 0; j < n - i + 1; j++) {
                 System.out.print("* ");
             }
             System.out.println();

         }
     }
}
