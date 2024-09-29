package kunalkushwaha.array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObject3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] arr=new String[5];
        for(int i=0;i< arr.length; i++){
            arr[i]= sc.next();
        }
      // System.out.println(arr[1]); //2
        //System.out.println(arr); //[Ljava.lang.String;@2f4d3709
       // System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]


        //modify the element
        arr[2]="chandan";  //put element then it will change
       // System.out.println(arr); //[Ljava.lang.String;@2f4d3709
        System.out.println(Arrays.toString(arr)); //[1, 2, chandan, 4, 5]
    }
}
