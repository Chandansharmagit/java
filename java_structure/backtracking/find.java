package backtracking;


import java.util.ArrayList;
import java.util.List;

public class find {
    public boolean isSafe(int row, int col, char[][] board){
        //checking horizontal possibility of queens
        for(int j = 0; j<board.length;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        //checking the vertical possibility of queens
        for(int i = 0 ; i<board.length;i++ ){
            if(board[col][i] == 'Q'){
                return false;
            }
        }

        //checking the upper right possibility for the queens
        int r = row;
        for(int c = col;c<=board.length && r >= 0; c++,r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
       
        //checking the upper left possibility for the queens to move
         r = row;
        for(int c =col ;c>=0 && r>=0;c--,r-- ){
            if(board[r][c] == 'Q'){
                return false;
            }
        }


        //checking the lower left case possibility for queens to movee
        r = row;
        for(int c = col;c>=0 && r<=board.length;c--,r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //checking the lower right  possibility for queens to move 

        r = row; 
        for(int c = col;c<board.length && r<board.length ;c++ ,r++ ){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;




        //end of the base case
    }

    public void saveBoard(char[][] board,  List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i = 0;i<board.length; i++){
            row = "";
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == 'Q')
                row += "";
                else
                row += ".";
            }

            newBoard.add(row);

        }

        allBoards.add(newBoard);
    }



    public void helper(char[][] board,  List<List<String>> allBoards,int col){

        //base condition
        if(col == board.length){
            saveBoard(board,allBoards);
            return;
        }



        for(int row = 0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);

                board[row][col] = '.';
            }

        }
    }
   public List<List<String>> solveNQueens(int n){
    List<List<String>> allBoards = new ArrayList<>();
    //2d array
    char[][] board = new char[n][n];

    helper(board, allBoards, 0);
    return allBoards;
   } 
}
