class Solution {
    List<List<String>> result = new ArrayList<>();

    public int totalNQueens(int n) {
        
    String[][] board = new String[n][n];
        for(int r = 0 ; r < n ; r++)
            Arrays.fill(board[r], ".");
        placeQueens(board, n, 0);        
        return result.size();

    }
     void placeQueens(String[][] board, int n, int col){

        if( col == n){
            List<String> resulti = new ArrayList<>();
            for(int r = 0 ; r < n ; r++){
                StringBuilder str = new StringBuilder();
                for(int c = 0 ; c < n ; c++){
                    str.append(board[r][c]);
                }
                resulti.add(str.toString());
            }
            result.add(resulti);
            return; // continue to find all solutions
        }
        for(int i = 0 ; i < n ; i++){
            if( isSafe(board, n, i, col)){
                board[i][col] = "Q";
                placeQueens(board, n, col+1);
                board[i][col] = ".";
            }
        }
    }

     boolean isSafe(String[][] board, int n , int i , int j){
        for(int c = 0 ; c < j ; c++)
            if(board[i][c] == "Q")
                return false;

        int r = i , c = j;
        while(r >= 0 && c >= 0){
            if(board[r][c] == "Q")
                return false;
            r--;
            c--;
        }

        r = i ; c = j;
        while(r < n && c >= 0){
            if(board[r][c] == "Q")
                return false;
            r++;
            c--;
        }
        return true; 
    }
}