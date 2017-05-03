package Solution51_100;

public class Solution74 {	
	   public boolean searchMatrix(int[][] matrix, int target) {
		   
		     int row = matrix.length;
	           if(row<=0) return false;
			  int col = matrix[0].length;
			  if(col<=0) return false;
		  
		  if(row == 1) return binary_search(matrix[0], target);
		  
		  int up = 0;
		  int low = row-1;
		  int mid = (up+low)/2;
		  
		  while(up<=low){
			  if(target == matrix[mid][0]) return true;
			  else if(target < matrix[mid][0]){
				  low = mid-1;
				 // if(up == low -1)  return binary_search(matrix[up], target);
				  mid = (up+low)/2;
			  }else {
				  up = mid+1; 
				 // if(up == low -1)  return binary_search(matrix[up], target);
				  mid = (up+low)/2;
			  }
			  
			  //if(up == low -1)  return binary_search(matrix[mid], target);
	
		  }
		  
		  System.out.println(mid);
		  
		  return binary_search(matrix[mid], target);
		  
	    }
	   
	   
	   public boolean binary_search(int[] vector, int target) {
		   
		   int left = 0; 
		   int right = vector.length-1;
		   
		   int mid = (left+right)/2;
				   
		   while(left<=right){ 
			   if(target == vector[mid]) return true;
			   else if(target<vector[mid]){
				   right = mid -1;
				   mid = (left+right)/2;
				   
			   } else {
				   left = mid +1;
				   mid = (left+right)/2;
			   }
		   }
		   
		   return false;
	}
}
