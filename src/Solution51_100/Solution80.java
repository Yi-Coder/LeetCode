package Solution51_100;


import java.util.LinkedHashMap;
import java.util.Map;

public class Solution80 {
	
	 public int removeDuplicates(int[] nums) {
		 
		 int len = nums.length;
		 
		 LinkedHashMap<Integer, Integer> list = new LinkedHashMap<Integer, Integer>();
		 
		 for(int i = 0; i<len; i++){
			 if(!list.containsKey(nums[i])){
				 list.put(nums[i], 1);
			 } else{
				 list.put(nums[i], Math.min(list.get(nums[i])+1, 2));
			 } 
		 }
		 
		 int k  =0;
		 
		 for(Map.Entry<Integer, Integer> entry : list.entrySet()){			
			 int i = 1;
			 while(i<=entry.getValue()){			 
				 nums[k++] = entry.getKey();			 
			 }
			 
		 }
		 
		 return k+1;
	        
	    }

}
