package Solution51_100;

import java.security.InvalidKeyException;

public class Solution59 {
    public int[][] generateMatrix(int n) {
    	
    	int [][] result = new int[n][n];
    	int row = n;
    	int col = n;
    	
    	int count = 0;
    	
    	int k = 0;
    	int l = 0;
    	
    	while(k<n &&l <n){	
    		for(int i = l; i< col; i++){
    		
    			result[k][i] = count++;
    		
    		}
    		k++;
    	
    		for(int j = k; j<row; j++){
    		
    			result[j][col-1] = count++;
    		
    		}
    		col--;
    		
    		// the last remaining row
    		if ( k < row)
            {
                for (int i = col-1; i >= l; --i)
                {
                	result[row-1][i]= count++;
                }
                row--;
            }
    		
    		// the first remaining col
    		if ( l < col)
            {
                for (int i = row-1; i >= k; --i)
                {
                	result[i][l] = count++;
                }
                l++;
            }
    	
    	}
    	
    	
    		return result;
        
    }
}
