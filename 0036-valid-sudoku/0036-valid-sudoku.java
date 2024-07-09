class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ;j++){
                if(!isValid(i , j , board))
                    return false;
            }
        }
        return true;
    }
    boolean isValid(int row , int col , char[][] board){
        if(board[row][col] == '.')
            return true;
        for(int i = 0 ; i < board.length ; i++){
            if(row != i && board[row][col] == board[i][col])    return false;
            if(col != i && board[row][col] == board[row][i])    return false;
            if((3*(row/3)+i/3) != row && (3*(col/3)+i%3) != col &&
               board[row][col] == board[(3*(row/3)+i/3)][(3*(col/3)+i%3)])  return false;
        }
        return true;
    }
}