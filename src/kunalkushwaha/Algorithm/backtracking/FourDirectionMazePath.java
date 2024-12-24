package kunalkushwaha.Algorithm.backtracking;
//BackTracking problem
public class FourDirectionMazePath {
    public static void main(String[] args) {
        int rows=3;
        int colm=3;
        boolean[][] isVisited=new boolean [rows][colm];
        print1(0,0,rows-1,colm-1,"",isVisited);
    }

    private static void print1(int sr, int sc, int er, int ec, String s,boolean[][] isVisited ) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;

        if (isVisited[sr][sc]==true) return;

        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        //check is visited or not
        isVisited[sr][sc]=true;
        //go down
        print1(sr+1,sc,er,ec,s+"D",isVisited);
        //go right
        print1(sr,sc+1,er,ec,s+"R",isVisited);
        //go left
        print1(sr,sc-1,er,ec,s+"L",isVisited);
        //go up
        print1(sr-1,sc,er,ec,s+"U",isVisited);

        //again make is false also for another possible ways//backtracking
        isVisited[sr][sc]=false;
    }
}
