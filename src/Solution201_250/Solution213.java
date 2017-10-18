package Solution201_250;

import java.util.Arrays;

public class Solution213 {
    public int rob(int[] nums) { 
    
    	 int len = nums.length;
     	   	
     	if(len == 0) return 0;
     	if(len ==1) return nums[0];
    	
    	return Math.max(nums[0]+helper(Arrays.copyOfRange(nums, 0, nums.length-2)), helper(Arrays.copyOfRange(nums, 1, nums.length-1)));

    }
    
    public int helper(int [] nums)
    {
   	 int len = nums.length;
 	 int robmax[] = new int[len];
 	   	
 	if(len == 0) return 0;
 	if(len ==1) return nums[0];
 	
 	robmax[len-1] = nums[len-1];
 	robmax[len-2] = Math.max(nums[len-2], nums[len-1]);

 	for(int i = len -3 ;i>=0;i--){
 		robmax[i] = Math.max(nums[i]+robmax[i+2], robmax[i+1]);
 	}
 	return Math.max(robmax[0], robmax[1]);
    }
    
    

}
