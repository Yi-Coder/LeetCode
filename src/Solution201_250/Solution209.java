package Solution201_250;


public class Solution209 {
	
	   public static int minSubArrayLen(int s, int[] nums) {
		   
		   if(nums == null) return 0;
		   
		   int left = 0;
		   int right = 0;
		   
		   int len = nums.length;
		   
		   int sum = 0;
		   
		   int minlen = Integer.MAX_VALUE;
		   
		   while(left<=right&&right<len){
			   while(sum<s && right<len){
				   sum += nums[right];
				   right++;
			   }
			   while(sum>=s && left<right){   	
				   	minlen = Math.min(minlen, right-left);
				   	sum -=nums[left];
			   		left++;
			   		
			   	}
		
		   }
		   return minlen ==Integer.MAX_VALUE? 0: minlen ; 	
	    }
	   
	   

}
