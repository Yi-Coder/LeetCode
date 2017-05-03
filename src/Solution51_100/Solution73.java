package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution73 {
	  public void setZeroes(int[][] matrix) {
		  
		  int row = matrix.length;
		  int col = matrix[0].length;
		  

		  List<Integer[]> index = new ArrayList<Integer[]>();

		  
		  for(int i = 0;i<row;i++)
			  for(int j = 0; j<col;j++){
				  if(matrix[i][j] == 0){
					  Integer[] temp = new Integer[2];
					  temp[0] = i; 
				      temp[1] = j;
					  index.add(temp);
				  }
			  }
				  
			for( Integer[] temp: index){
				for(int i = 0; i<row;i++){
					matrix[i][temp[1]] = 0;
				}
				
				for(int i = 0; i<col;i++){
					matrix[temp[0]][i] = 0;
				}
			}
	        
	  

}
	  
}
