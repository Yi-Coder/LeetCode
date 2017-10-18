package Solution151_200;


public class Solution174 {
	
    public int calculateMinimumHP(int[][] dungeon) {
    	
    	int row = dungeon.length;
    	if(row <= 0 ) return 0;
    	int col = dungeon[0].length;
    	
    	int [][] minimumEnergy = new int [row][col];
  
    	minimumEnergy[row-1][col-1] = Math.max(1 - dungeon[row - 1][col - 1], 1);
    	
    	for(int i = row-2; i>=0; i--) {
    		minimumEnergy[i][col-1] = Math.max(minimumEnergy[i+1][col-1]-dungeon[i][col-1], 1);
    	}
    	
    	for(int i = col-2; i>=0; i--){
    		
    		minimumEnergy[row-1][i] = Math.max(minimumEnergy[row-1][i+1]-dungeon[row-1][i], 1);
    	
    	}
    	
    	for(int i = row-2; i>=0; i--)
    		for(int j = col-2; j>=0; j--){
    			
    			int right =  Math.max(minimumEnergy[i][j+1]-dungeon[i][j], 1);
    			int down =  Math.max(minimumEnergy[i+1][j]-dungeon[i][j], 1);
    		  minimumEnergy[i][j] = Math.min(right, down);
    	
    		}
    	 	
    	return minimumEnergy[0][0];
        
    }

}
