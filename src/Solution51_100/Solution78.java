package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
	
	  public List<List<Integer>> subsets(int[] nums) {
		  
		  List<Integer> com = new ArrayList<Integer>();		  
		  List<List<Integer>> result = new ArrayList<List<Integer>>();
		  	  
		  for(int k = 0;k<=nums.length; k++){
			  List<List<Integer>> temp = new ArrayList<List<Integer>>();
			  findcom(nums,1,k,com,temp); 
			  result.addAll(temp);
		  }

		  return result;
	        
	    }
	  
	  
	  
	  public void findcom(int []nums, int start, int k, List<Integer> com, List<List<Integer>> result){
		  
		  if(com.size() == k){	
			  result.add(new ArrayList<Integer> (com));
			  return;
		  }
		
		  for(int i = start; i<= nums.length-1;i++ ){
			  com.add(nums[i]);
			  findcom(nums, i+1, k, com, result);
			  com.remove(com.size()-1);
		  }
		  
	  }


}
