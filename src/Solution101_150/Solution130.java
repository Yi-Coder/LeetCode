package Solution101_150;

import java.util.HashSet;
import java.util.Stack;

public class Solution130 {
	
	class coordinate{
		int row;
		int col;
		public coordinate(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	
	   public void solve(char[][] board) {
		   
		   int row = board.length;
		   if(row<=2) return; 
		   int col = board[0].length;
		   if(col<=2) return;
		   
		   Stack<coordinate> stack = new Stack<coordinate>();
		   
		   HashSet<coordinate> set = new HashSet<coordinate>();
		   
		   boolean[][] visited = new boolean[row][col];
		   
		   //the up
		   for(int i = 0 ;i<col;i++){			   
			   if(visited[0][i]==false && board[0][i] =='O'){
				   stack.push(new coordinate(0, i));
				   while(!stack.isEmpty()){
					   coordinate temp = stack.pop();
					   visited[temp.row][temp.col] = true;
					   set.add(temp);

					   //upper
					   if(temp.row-1>=0 && visited[temp.row-1][temp.col]==false &&board[temp.row-1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row-1, temp.col));
					   
					   //lower
					   if(temp.row+1<row && visited[temp.row+1][temp.col]==false &&board[temp.row+1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row+1, temp.col));
					   
					   //left
					   if(temp.col-1>=0 && visited[temp.row][temp.col-1]==false &&board[temp.row][temp.col-1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col-1));
					   
					   //right
					   if(temp.col+1<col && visited[temp.row][temp.col+1]==false &&board[temp.row][temp.col+1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col+1));
				   }
			   }
		   }
		   
	
		   //the right
		   for(int i = 1 ;i<col;i++){
			   if(visited[i][col-1]== false && board[i][col-1] =='O'){
				   stack.push(new coordinate(i, col-1));
				 
				   while(!stack.isEmpty()){
					   coordinate temp = stack.pop();;
					   visited[temp.row][temp.col] = true;
					   set.add(temp);
					 
					   //upper
					   if(temp.row-1>=0 && visited[temp.row-1][temp.col]==false &&board[temp.row-1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row-1, temp.col));
					   
					   //lower
					   if(temp.row+1<row && visited[temp.row+1][temp.col]==false &&board[temp.row+1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row+1, temp.col));
					   
					   //left
					   if(temp.col-1>=0 && visited[temp.row][temp.col-1]==false &&board[temp.row][temp.col-1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col-1));
					   
					   //right
					   if(temp.col+1<col && visited[temp.row][temp.col+1]==false &&board[temp.row][temp.col+1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col+1));
					   
				   }
			   }
		   }
		   

		   
		   //the left
		   for(int i = 1 ;i<row;i++){
			   if(visited[i][0]==false && board[i][0] =='O'){
				   stack.push(new coordinate(i, 0));
				   while(!stack.isEmpty()){
					   coordinate temp = stack.pop();;
					   visited[temp.row][temp.col] = true;
					   set.add(temp);
					 
					   //upper
					   if(temp.row-1>=0 && visited[temp.row-1][temp.col]==false &&board[temp.row-1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row-1, temp.col));
					   
					   //lower
					   if(temp.row+1<row && visited[temp.row+1][temp.col]==false &&board[temp.row+1][temp.col]=='O')
						   	stack.push(new coordinate(temp.row+1, temp.col));
					   
					   //left
					   if(temp.col-1>=0 && visited[temp.row][temp.col-1]==false &&board[temp.row][temp.col-1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col-1));
					   
					   //right
					   if(temp.col+1<col && visited[temp.row][temp.col+1]==false &&board[temp.row][temp.col+1]=='O')
						   	stack.push(new coordinate(temp.row, temp.col+1));
				   }
			   }
		   }
		   

		   
		   
		   //the bottom
		   for(int i = 1 ;i<col-1;i++){
			   if(visited[row-1][i]==false && board[row-1][i] == 'O'){
				   stack.push(new coordinate(row-1, i));
				   while(!stack.isEmpty()){
					   coordinate temp = stack.pop();
					   visited[temp.row][temp.col] = true;
					   set.add(temp);
					   //upper
					   if(temp.row-1>=0 && visited[temp.row-1][temp.col]== false && board[temp.row-1][temp.col] =='O'){
						   System.out.println(temp.row-1+" "+temp.col);
						   System.out.println(board[temp.row-1][temp.col]);
							stack.push(new coordinate(temp.row-1, temp.col));
					   }
						   
					   
					   //lower
					   if(temp.row+1<row && visited[temp.row+1][temp.col]==false &&board[temp.row+1][temp.col]=='O'){
						   System.out.println(temp.row+1+" "+temp.col);
						   System.out.println(board[temp.row+1][temp.col]);
						   stack.push(new coordinate(temp.row+1, temp.col));
					   }
						   	
					   
					   //left
					   if(temp.col-1>=0 && visited[temp.row][temp.col-1]==false &&board[temp.row][temp.col-1]=='O'){
						   System.out.println(temp.row +" "+(temp.col-1));
						   System.out.println(board[temp.row][temp.col-1]);
						   stack.push(new coordinate(temp.row, temp.col-1));
					   }
						   	
					   
					   //right
					   if(temp.col+1<col && visited[temp.row][temp.col+1]==false &&board[temp.row][temp.col+1]=='O'){
						   System.out.println(temp.row+" "+(temp.col+1));
						   System.out.println(board[temp.row][temp.col+1]);
						   stack.push(new coordinate(temp.row, temp.col+1));
					   }
						   	
				   }
			   }
		   } 
		   	for(int i = 1; i<row-1;i++){
		   		for(int j = 1; j<col-1;j++){
		   			if(visited[i][j] == false && board[i][j] =='O') board[i][j] = 'X';
		   		}
		   	}
		   	  
	        
	    }

}
