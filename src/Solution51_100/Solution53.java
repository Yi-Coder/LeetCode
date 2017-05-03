package Solution51_100;

public class Solution53 {
	  public int maxSubArray(int[] nums) {
		  
		  int len = nums.length;
		 
		  int max = nums[0];
		  for(int i = 1; i<len;i++){
			  nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);
			  max = Math.max(nums[i], max);
		  }
		  
		  return max;
	        
	    }

}
