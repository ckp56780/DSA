package kunalkushwaha.Algorithm.backtracking;

public class printPermutations {
    public static void main(String[] args) {
        String str="123";
        printP(str,"");
    }

    private static void printP(String str, String s) {
        //create the base case
        if (str.equals("")){
            System.out.println(s);
            return;
        }

        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i); //b
            String left=str.substring(0,i); //a
            String right=str.substring(i+1); //c
            String rem=left+right;
            printP(rem,s+ch);

        }
    }
}
