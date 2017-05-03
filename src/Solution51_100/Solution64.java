package Solution51_100;

public class Solution64 {
	   public int minPathSum(int[][] grid) {
		   
		        int m = grid.length;

		     	int n = grid[0].length;

		     	int [][] paths = new int[m][n];
		     	
	           paths[m-1][n-1] =grid[m-1][n-1];
	
		     	
		     	for(int i = m-2;i>= 0;i--){
		     		
		     		paths[i][n-1] = paths[i+1][n-1]+grid[i][n-1];
		     	}
		     	
		     	for(int i = n-2 ;i >= 0 ; i--){
		     		paths[m-1][i] = paths[m-1][i+1]+grid[m-1][i];
		  
		     	}
		     	
		     	for(int i = m-2; i>=0 ;i--){
		     		for(int j =n-2;j>=0;j--){
		     			
		     			paths[i][j] = Math.min(paths[i+1][j] +grid[i][j], paths[i][j+1]+grid[i][j]);
		     			
		     		}
		     	}
		     	
		     	return paths[0][0];
	        
	    }

}
