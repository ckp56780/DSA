package kunalkushwaha.recursion_08.raghavSir;

import java.util.Scanner;

public class PrintDecreasingAndIncreasing_07 {
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        PrintOneToFive(n);
    }
    public static void PrintOneToFive ( int n){
        if (n==0) return;
        System.out.print(n+" ");
        PrintOneToFive(n-1);
        System.out.print(n+" ");

    }
}