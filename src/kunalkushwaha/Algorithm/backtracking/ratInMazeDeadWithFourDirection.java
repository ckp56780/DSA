package kunalkushwaha.Algorithm.backtracking;
//BackTracking problem
public class ratInMazeDeadWithFourDirection {
    public static void main(String[] args) {
        int rows=4;
        int colm=6;
        int[][] maze={{1,0,1,1,1,1},
                      {1,1,1,0,1,1},
                      {1,1,0,0,0,1},
                      {0,1,1,1,1,1}};
        boolean[][] isVisited=new boolean [rows][colm];
        print3(0,0,rows-1,colm-1,"",maze,isVisited);
    }

    private static void print3(int sr, int sc, int er, int ec, String s,int[][] maze,boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;  //if any col,row found 0 return.
        if (isVisited[sr][sc]==true) return;


        //check is visited or not
        isVisited[sr][sc]=true;
        //go down
        print3(sr+1,sc,er,ec,s+"D",maze,isVisited);
        //go right
        print3(sr,sc+1,er,ec,s+"R",maze,isVisited);
        //go left
        print3(sr,sc-1,er,ec,s+"L",maze,isVisited);
        //go up
        print3(sr-1,sc,er,ec,s+"U",maze,isVisited);

        //again make is false also for another possible ways//backtracking
        isVisited[sr][sc]=false;
    }
}
