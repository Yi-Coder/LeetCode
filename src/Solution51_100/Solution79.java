package Solution51_100;

import java.util.Arrays;
import java.util.Stack;


public class Solution79 {
	  public boolean exist(char[][] board, String word) {		  
		  int row = board.length;
		  if(row == 0) return false;
		  
		  int col = board[0].length;
		  boolean [][] visited = new boolean[row][col];	
		  Stack<int[]> path = new Stack<int[]>();	
		 
		  
		  for(int i = 0 ; i<row; i++){
			  for(int j = 0 ; j<col;j++){
				 //if(board[i][j] == word.charAt(0)){
					 if(contained(board,i,j,visited,0,row,col,path,word)) return true;  
					  System.out.println(path.size());  
					  for(int [] t: path){
					  System.out.println(t[0] + " " + t[1]);
					  }					
				  }
			  }
		 // }		  
	
		  return false;
	        
	    }
	  
	  public boolean contained(char[][] board,int r, int c, boolean [][] visited, int start, int row, int col,Stack<int[]> path, String word){
		  
		  if(start == word.length()) return true;

		  path.push(new int[]{r,c});
		  
		  
		 if( r<0 ||c<0 || r >= row || c>=col || visited[r][c] || board[r][c] != word.charAt(start))  return false;
		 
		 visited[r][c] = true;
		 
		 if(contained(board,r-1,c, visited,start+1,row, col,path,word)) return true;
		 
		 if(contained(board,r,c-1, visited,start+1,row, col,path,word)) return true;

		 if(contained(board,r+1,c, visited,start+1,row, col,path,word)) return true;

		 if(contained(board,r,c+1, visited,start+1,row, col,path,word)) return true;
	
		 path.pop();
		 visited[r][c]= false;
			  
		return false;
		  
	  }

}
