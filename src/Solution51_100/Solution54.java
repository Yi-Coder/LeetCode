package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> result = new ArrayList<Integer>();
    	
    	int row = matrix.length;
    	  if (row == 0) {
              return result;
          }
    	int col = matrix[0].length;
    	int k = 0, l = 0;
    	
    	while(k<row && l <col){
    		
    		//the first remaining row 
    		for(int i = l;i<col;i++){
    			result.add(matrix[k][i]);
    		}
    		k++;
    		
    		//for the last remaining column
    		for(int i = k; i<row;i++){
    			result.add(matrix[i][col-1]);
    		}
    		col--;
    		
    		// the last remaining row
    		if ( k < row)
            {
                for (int i = col-1; i >= l; --i)
                {
                	result.add(matrix[row-1][i]);
                }
                row--;
            }
    		
    		// the first remaining col
    		if ( l < col)
            {
                for (int i = row-1; i >= k; --i)
                {
                	result.add(matrix[i][l]);
                }
                l++;
            }
    		
    		
    	}
        
        return result;
    }
}
