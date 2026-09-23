package kunalkushwaha.recursion_08.raghavSir;

/* Recursion is a technique where a
 function calls itself to solve a smaller version of the same problem.

 so we can in the belaw example it will call recursilvey with infinite and last
 it will show stackOverFlow-

 we can stop it by giving the base case

 */
public class basicPart_01 {
    public static void main(String[] args) {
        raghav(1); //here we are calling the same function itself

    }
    public static void  raghav(int n){

        //defining the base case here to stop the loop
        if (n==10){
            return;
        }
        System.out.println("priya");
        raghav(n+1);
    }
}

