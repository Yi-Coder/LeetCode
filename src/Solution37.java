import java.util.HashSet;

public class Solution37 {
	
	  public void solveSudoku(char[][] board) {
		  
		  	solve(board);
		    
	    }
	  
	  public boolean solve(char[][] board){
		    for(int i=0; i<9; i++){
		        for(int j=0; j<9; j++){
		            if(board[i][j]!='.')
		                continue;
		 
		            for(int k=1; k<=9; k++){
		                board[i][j] = (char) (k+'0');
		                if(isValid(board, i, j) && solve(board))
		                    return true;
		                board[i][j] = '.';    
		            }
		 
		            return false;
		        }
		    }
		 
		    return true; // does not matter
		}
	  
	  public boolean isValid(char[][]board, int crow,int ccol){
		  
			HashSet<Character> characters = new HashSet<Character>();
			
			//check row 
				for(int k = 0; k<9; k++){				
				 if(characters.contains(board[crow][k])) return false;
				 if(board[crow][k]!='.') characters.add(board[crow][k]);
				}
				characters.clear();
				
			//check column 
				for(int k = 0; k<9; k++){				
					 if(characters.contains(board[k][ccol])) return false;
					 if(board[k][ccol]!='.') characters.add(board[k][ccol]);
					}
					characters.clear();
			
			//check subbox 
	
					int row = crow/3*3;
					int col = ccol/3*3;
					characters.clear();	
					for(int m = row; m<row+3; m++ )
						for(int n = col; n < col+3; n++)
						{
							 if(characters.contains(board[m][n])) return false;
							 if(board[m][n]!='.') characters.add(board[m][n]);

						}
			
	       return true; 
		  
	  }

}
