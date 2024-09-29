package pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("give the input value:");
        int n=sc.nextInt();//here we have initialized input
        pattern4(n);
    }
    public static void pattern4(int n){
        for(int i=1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +"");
            }
            System.out.println();
        }

    }
}
