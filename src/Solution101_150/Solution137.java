package Solution101_150;

public class Solution137 {
	
	   public int singleNumber(int[] nums) {

		   int len = nums.length;
		   
		   int result =0;
		   
		   for(int i = 0; i<len; i++){
			   result = nums[i]^result;
		   }
		   
		   return result;
	        
	    }

}
