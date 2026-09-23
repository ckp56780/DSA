package kunalkushwaha.recursion_08.raghavSir;

import java.util.Scanner;

public class OneToN_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        PrintOneToFive(1,n);

    }
    public static void PrintOneToFive(int x,int n ){
        if (x>n) return;
        System.out.println(x);
        PrintOneToFive(x+1,n);

    }
}
