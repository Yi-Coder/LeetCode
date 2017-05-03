import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution46 {
	   public List<List<Integer>> permute(int[] nums) {
		   
		   List<Integer> ss = new ArrayList<Integer>();
		   
		   for(int i = 0; i<nums.length; i++){	
			   ss.add(0,nums[i]);
		   }
		   return helper(ss);
	
	   	}
	   
	   
	   public List<List<Integer>> helper(List<Integer> nums) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        
	        int len = nums.size();
	        if(len<=0) return result;
	        
	        if(len == 1 ) {
	        	result.add(nums);
	        	return result;
	        }else{  
	        	for(int i = 0;i<nums.size();i++)
	        	{
	        		 List<Integer> temp1 = new ArrayList<Integer>(nums);
	        		
	        		int tmp = temp1.get(i);
	        		temp1.remove(i);
	        		 
	        		 List<List<Integer>> temp = helper(temp1);
	        		 for( List<Integer> t: temp){
	        			 t.add(0, tmp);
	        			 if(!result.contains(t)){
	        			 result.add(t);
	        			 }
	        		 }
	        	
	        	}
	        }	        
		        return result;	
	   }
	   }
