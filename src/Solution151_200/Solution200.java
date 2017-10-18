package Solution151_200;

import java.util.LinkedList;
import java.util.Queue;

public class Solution200 {
	
	class coodinate{
		int x;
		int y;
		public coodinate(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	  public int numIslands(char[][] grid) {
		  int [] count = {0};
		  helper(grid, count);
	       return count[0];
	    }
	  
	  public void helper(char [][]grid, int [] count){  
		  if(isempty(grid)) return ;
		  else{
			  count[0] = count[0]+1; 
			  System.out.println(count[0]);
			  Queue<coodinate> queue = new LinkedList<coodinate>();
			  
			  for(int i = 0; i<grid.length;i++)
				  for(int j = 0; j<grid[0].length; j++){
					  if(grid[i][j] == '1'){
						  queue.add(new coodinate(i, j));
						  grid[i][j] = '0';
						  while(!queue.isEmpty()){  
							  //System.out.println(queue.size());
							  
							  if(queue.peek().x+1 < grid.length){
								  if(grid[queue.peek().x+1][queue.peek().y] == '1'){
									  queue.add(new coodinate(queue.peek().x+1,queue.peek().y));
									  grid[queue.peek().x+1][queue.peek().y] = '0';
									
								  }
							  }
							  
							  if(queue.peek().y+1 < grid[0].length){
								  if(grid[queue.peek().x][queue.peek().y+1] == '1'){
									  queue.add(new coodinate(queue.peek().x,queue.peek().y+1));
									  grid[queue.peek().x][queue.peek().y+1] = '0';
								  }
							  }
							  
							  if(queue.peek().x-1 >= 0){
								  if(grid[queue.peek().x-1][queue.peek().y] == '1'){
									  queue.add(new coodinate(queue.peek().x-1,queue.peek().y));
									  grid[queue.peek().x-1][queue.peek().y] = '0';
									
								  }
							  }
							  
							  if(queue.peek().y-1 >= 0){
								  if(grid[queue.peek().x][queue.peek().y-1] == '1'){
									  queue.add(new coodinate(queue.peek().x,queue.peek().y+1));
									  grid[queue.peek().x][queue.peek().y-1] = '0';
								  }
							  }
							  
							  
							  queue.poll();
						  }
						  
						  helper(grid,count);
					  } 
					 
				  }
		  }
		  
	  }
	  
	  public boolean isempty(char [][] grid){		  
		  for(int i = 0; i<grid.length;i++)
			  for(int j = 0; j<grid[0].length; j++){
				  if(grid[i][j] == '1'){
					  return false;
				  } 
				 
			  }
		  return true;
	  }

}
