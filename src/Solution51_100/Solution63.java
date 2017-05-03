package Solution51_100;

public class Solution63 {
	
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	
        int m = obstacleGrid.length;
     	//if(m == 0) return 0;

     	int n = obstacleGrid[0].length;
     	
     	//System.out.println(m);
     	//System.out.println(n);
  
     	int [][] paths = new int[m][n];
     	
     	if(obstacleGrid[m-1][n-1] != 1) paths[m-1][n-1] =1;
     	else paths[m-1][n-1] = 0;
     	
     	for(int i = m-2;i>= 0;i--){
     		
     		if(obstacleGrid[i][n-1] != 1)  paths[i][n-1] = paths[i+1][n-1];
     		else paths[i][n-1] = 0;
     	}
     	
     	for(int i = n-2 ;i >= 0 ; i--){
     		if(obstacleGrid[m-1][i] != 1)  paths[m-1][i] = paths[m-1][i+1];
     		else paths[m-1][i] = 0;
  
     	}
     	
     	for(int i = m-2; i>=0 ;i--){
     		for(int j =n-2;j>=0;j--){
     			
     			if((obstacleGrid[i][j] != 1)) paths[i][j] = paths[i+1][j] + paths[i][j+1];
     			else paths[i][j] = 0;
     			
     		}
     	}
     	
     	return paths[0][0];
        
    }

}
