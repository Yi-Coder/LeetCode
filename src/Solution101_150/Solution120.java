package Solution101_150;

import java.util.List;

public class Solution120 {
	
	  public int minimumTotal(List<List<Integer>> triangle) {
		  
		  int n = triangle.size();
		  
		  if(n == 0) return 0;  
		  else{
			  
			  int [] lower = new int[n];
			  int [] up = new int[n];
			  
			  for(int i = 0; i<n;i++){
				  lower[i] = triangle.get(n-1).get(i);
				 
			  }
			  
			  for(int i = n-1; i>0;i--){
				  for(int j = 0; j< i;j++){
					  up[j] = Math.min(lower[j]+triangle.get(i-1).get(j), lower[j+1]+triangle.get(i-1).get(j));
					  System.out.print(up[j]+" ");
				  }
				  System.out.println();
				  lower = up;
			  }

			  return lower[0];
		  }
	        
	    }

}
