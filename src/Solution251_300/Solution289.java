package Solution251_300;

public class Solution289 {
	
    public void gameOfLife(int[][] board) {
    	if (board == null || board.length == 0) return;
    	
    	int row = board.length;
    	int col = board[0].length;
    	
    	
    	int lives = 0;
    	for(int i = 0 ; i<row; i++)
    		for(int j = 0; j<col; j++){
    			lives = getlives(board, row-1, col-1, i, j);
    			 if (board[i][j] == 1 && lives >= 2 && lives <= 3) {  
    	                board[i][j] = 3; // Make the 2nd bit 1: 01 ---> 11
    			 }
    			 
    			 if (board[i][j] == 0 && lives == 3) {
    	                board[i][j] = 2; // Make the 2nd bit 1: 00 ---> 10
    	            }
    		}
    	
    	 for (int i = 0; i < row; i++) {
    	        for (int j = 0; j < col; j++) {
    	            board[i][j] >>= 1;  // Get the 2nd state.
    	        }
    	    }
    	
    	
    }
    
    public int getlives(int[][]board, int row, int col, int i, int j){
    	int lives = 0; 
    	
    	for(int x = Math.max(i-1, 0); x<Math.min(i+1, row); x++)
    		for(int y = Math.max(j-1, 0); y<Math.min(j+1,col);y++){
    			 lives += board[x][y] & 1;
    		}
    	lives -= board[i][j] & 1;
    	return lives;
    }
}
