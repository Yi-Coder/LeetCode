package Solution201_250;

import java.util.HashMap;
import java.util.TreeSet;

import javax.naming.ReferralException;

public class Solution217 {
	
	  public boolean containsDuplicate(int[] nums, int k) {
		  
		  int len = nums.length;
		  
		  if(len<=1) return false;
		  
		  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  
		  for(int i = 0 ; i < len ; i++ ){
			  if(map.containsKey(nums[i])){
					if(Math.abs(i- map.get(nums[i]))<=k) return true;
					else map.put(nums[i], i);
			  } 
			  else{
				  map.put(nums[i], i);
			  }
		  }
		  
		 
		 return false;
	        
	    }
	  
	  
	  public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		  
		  int len = nums.length;
		  if(len<=1) return false;
		  
		  TreeSet<Integer> ts = new TreeSet<Integer>();
		  for(int i = 0 ;i <len;  i++){
			  long tmp = nums[i];
			if(ts.floor(nums[i]) != null && tmp-ts.floor(nums[i])<=(long)t) return true;
			if(ts.ceiling(nums[i]) != null && ts.ceiling(nums[i])-tmp<=(long)t) return true;
			ts.add(nums[i]);
			if(i>=k){
				ts.remove(nums[i-k]);
			}
			
		  }
		  
		  return false;
	        
	    }

}
