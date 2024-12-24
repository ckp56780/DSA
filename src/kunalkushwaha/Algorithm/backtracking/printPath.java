package kunalkushwaha.Algorithm.backtracking;

public class printPath {
    public static void main(String[] args) {
        int rows=3;
        int colm=3;
         print(0,0,rows-1,colm-1,"");     //we can also write-- sr:1,sc:1,er:rows,ec:colm,s:""
         //where print is defined method
        //OUTPUT::::;
        //DDRR
        //DRDR
        //DRRD
        //RDDR
        //RDRD
        //RRDD

    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
        }

        //go down
        print(sr+1,sc,er,ec,s+"D");
        //go right
        print(sr,sc+1,er,ec,s+"R");
    }


}

