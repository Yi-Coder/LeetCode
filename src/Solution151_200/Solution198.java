package Solution151_200;

public class Solution198 {
	
    public int rob(int[] nums) {
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
    
    /*public int helper(int[] nums, int index){
    	
    	if(index > nums.length-1) return 0;
    	if(index == nums.length-1){
    		return nums[index];
    	}
    	
    	int sum = 0; 
    	
    	sum = Math.max(nums[index]+ helper(nums, index+2), helper(nums, index+1));
    	
    	return sum;
    }*/

}
