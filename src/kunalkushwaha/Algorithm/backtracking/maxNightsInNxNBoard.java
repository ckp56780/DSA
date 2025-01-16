package kunalkushwaha.Algorithm.backtracking;

public class maxNightsInNxNBoard {

    //define the global variable for counting the max Knights
    static int maxKnights=-1;


    public static void main(String[] args) {
        int n=3;
        char[][] board=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j]='x';   //x value dal diya board me
            }

            //calling the 2nd function
            nKnights(board,0,0,0);

        }
    }

    public static boolean isSafe(char[][] board, int row,int col){
        int n=board.length; //calculate the board length
        int i,j;
        //2 up 1 right
        i=row-2;
        j=col+1;
        if (i>=0 && j<n  && board[i][j]=='K') return false;

        //2 up 1 left
        i=row-2;
        j=col-1;
        if (i>=0 && j>=0 && board[i][j]=='K') return false;

        //2 down 1 right
        i=row+2;
        j=col+1;
        if (i<n && j<n && board[i][j]=='K') return false;


        //2 down 1 left
        i=row+2;
        j=col-1;
        if (i<n && j>=0 && board[i][j]=='K') return false;

        //2 right 1 up
        i=row-1;
        j=col+2;
        if (i>=0 && j<n && board[i][j]=='K') return false;

        //2 right 1 down
        i=row+1;
        j=col+2;
        if (i<n && j<n && board[i][j]=='K') return false;

        //2 left 1 up
        i=row-1;
        j=col-2;
        if (i>=0 && j>=0 && board[i][j]=='K') return false;

        //2 left 1 down
        i=row+1;
        j=col-2;
        if (i<n && j>=0 && board[i][j]=='K') return false;

        return true;
    }

    //2nd method to count the no of Knights
    public static void nKnights(char[][] board ,int row,int col,int num){

        int n=board.length;
        //base case
        if(row==n){
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.println(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        } else if (isSafe(board,row,col)) {
            board[row][col]='K';
            if (col!=n-1)  nKnights(board,row,col+1,num+1);
            else nKnights(board,row+1,0,num+1);
            board[row][col]='x';  //backtracking

        }
        if (col!=n-1) nKnights(board,row,col+1,num);
            else nKnights(board,row+1,0,num);

            
        }

    }

