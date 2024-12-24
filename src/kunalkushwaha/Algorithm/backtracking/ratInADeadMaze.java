package kunalkushwaha.Algorithm.backtracking;

public class ratInADeadMaze {
    public static void main(String[] args) {
        int rows=4;
        int colm=6;
        int[][] maze={{1,0,1,1,1,1},
                      {1,1,1,0,1,1},
                      {1,1,1,0,0,1},
                      {0,1,1,1,1,1}};
        print3(0,0,rows-1,colm-1,"",maze);
    }

    private static void print3(int sr, int sc, int er, int ec, String s,int[][] maze) {
        if(sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;  //if any col,row found 0 return.


        //go right
        print3(sr,sc+1,er,ec,s+"R",maze);
        //go down
        print3(sr+1,sc,er,ec,s+"D",maze);
    }
}
