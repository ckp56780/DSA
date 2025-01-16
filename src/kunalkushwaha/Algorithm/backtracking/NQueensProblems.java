package kunalkushwaha.Algorithm.backtracking;

public class NQueensProblems {
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='x';
            }
        }
    }
}
