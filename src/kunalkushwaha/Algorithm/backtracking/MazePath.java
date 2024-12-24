package kunalkushwaha.Algorithm.backtracking;

public class MazePath {
    public static void main(String[] args) {
        int rows=2;
        int colm=2;
        int count=maze(1,1,rows,colm);
        System.out.println(count); //2
    }

    private static int maze(int sr, int sc, int er, int ec) {
        //where sr-start row,sc-start col,er-end row,ec-end col

        if(sr>er ||sc>ec) return 0;
        if (sr==er && sc==ec) return 1;

        //create here the downWays-
        int downWays=maze(sr+1,sc,er,ec);

        //create the right ways
        int rightWays=maze(sr,sc+1,er,ec);

        int totalWays= downWays+rightWays;
        return totalWays;

    }


}
