package kunalkushwaha.recursion_08.raghavSir;

import java.util.Scanner;

public class basicPart_03 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            PrintOneToFive(n);

        }
        public static void PrintOneToFive(int n){
            //define the base case
            if (n==0) return; //5==0-no,4==0-no,3==0-no,2==0-no,1==0-no,0==0-yes--break the loop
            System.out.println(n);

            //sub-problem
            PrintOneToFive(n-1); //if n+1 it will give stack over flow error
        }
    }
