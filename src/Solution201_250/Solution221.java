package Solution201_250;

public class Solution221 {
	
	   public int maximalSquare(char[][] matrix) {
		   
		  int row = matrix.length;
		  int col = matrix[0].length;
		  
		  int [][] ret = new int[row][col];
		  
		  int max = 0;
		  
		  
		  //for the first row
		  for(int i = 0 ; i< col; i++){
			  ret[0][i] = matrix[0][i] =='1'? 1:0;
			  
			  if(ret[0][i]>max) max = ret[0][i];
		  }
		  
		  //for the first col
		  for(int i = 0 ; i< row; i++){
			  ret[i][0] = matrix[i][0] =='1'? 1:0;	  
			  if(ret[i][0]>max) max = ret[i][0];
		  }
		  
		  for(int i = 1; i<row; i++)
			  for(int j = 1; j<row; j++){
				  
                  if(matrix[i][j] != '0')
				    ret[i][j] = Math.min(ret[i-1][j-1], Math.min(ret[i-1][j], ret[i][j-1]))+1;
                  else ret[i][j] =0;
				  
				  if(ret[i][j]>max) max =ret[i][j];

			  }
		  
		  return max*max;
	        
	    }

}
