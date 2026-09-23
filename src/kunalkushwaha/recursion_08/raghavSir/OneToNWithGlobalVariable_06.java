package kunalkushwaha.recursion_08.raghavSir;

import java.util.Scanner;

public class OneToNWithGlobalVariable_06 {
    static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        PrintOneToFive(n);
    }
        public static void PrintOneToFive ( int n){
            if (n==0) return;
            PrintOneToFive(n-1);
            System.out.print(n+" ");

        }
}