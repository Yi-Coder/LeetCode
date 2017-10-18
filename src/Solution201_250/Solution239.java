package Solution201_250;

public class Solution239 {
	
    public int[] maxSlidingWindow(int[] nums, int k) {
    	if(nums.length<=0) return null;
    	
    	int resL = nums.length-k+1;
    	int [] res = new int[resL];
    	
    	res[0] = max(nums, 0, k);
    	
    	for(int i = 1; i<resL; i++){
    		if(nums[i+k-1]>res[i-1]) res[i]=nums[i+k-1];
    		else if(nums[i-1] < res[i-1]) res[i] =res[i-1];
    		else res[i] =max(nums, i, k);
    	}
    	
    	return res;
    }
    
    public int max(int nums[], int start, int k) {	
    	int max = Integer.MIN_VALUE;
    	for(int i = start; i<k+start;i++){
    		if(nums[i]> max) max = nums[i];
    	}
    	return max;
	}

}
