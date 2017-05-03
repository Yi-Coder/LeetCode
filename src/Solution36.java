import java.util.HashSet;

public class Solution36 {
	
	
public boolean isValidSudoku(char[][] board) {
	
		//final int length = 9;
	
		HashSet<Character> characters = new HashSet<Character>();
		
		//check row 
		for(int i = 0; i<9;i++ ){
			characters.clear();
			for(int j = 0; j<9; j++){				
			if(board[i][j] == '.') continue;
				
			else if(characters.contains(board[i][j])) return false;
				   else {
					characters.add(board[i][j]);
				}
			}
		}
		
		//check column 
		for(int j = 0; j<9;j++ ){
			characters.clear();
			for(int i = 0; i<9; i++){
				if(board[i][j] == '.') continue;
				
				else if(characters.contains(board[i][j])) return false;
				   else {
					characters.add(board[i][j]);
				}
			}
		}
		
		//check subbox 
		for(int i = 0; i<3;i++ ){
			for(int j = 0; j<3; j++){
				
				int row = i*3;
				int col = j*3;
				characters.clear();	
				for(int m = row; m<row+3; m++ )
					for(int n = col; n < col+3; n++)
					{
						if(board[m][n] == '.') continue;
						else if(characters.contains(board[m][n])) return false;
						   else {
							characters.add(board[m][n]);
						}
						
					}
				
			   
			}
		}
		
		
       return true; 
    }

}
