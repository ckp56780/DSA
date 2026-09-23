package kunalkushwaha.recursion_08.raghavSir;

import java.util.Scanner;
//this example for printing N element with global variable
//To be honest in the interview don't use this method into the interview
public class OneToNWithGlobalVariable_05 {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        PrintOneToFive(1);

    }
    public static void PrintOneToFive(int x){
        if (x>n) return;
        System.out.println(x+"");
        PrintOneToFive(x+1);

    }
}
