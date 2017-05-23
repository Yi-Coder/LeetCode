package Solution151_200;

public class Solution154 {
	
    public int findMin(int[] nums) {
    	
    	int len = nums.length;
    	
    	if(len == 0) return 0;
    	if(len == 1) return nums[0];
    	if(len == 2) return Math.min(nums[0], nums[1]);
    	
    	for(int i = 0; i<len ; i++){
    		if(nums[(i+1)%len] < nums[i%len]){
    			return nums[(i+1)%len];
    		}
    	}
        return 0;
    }

}
