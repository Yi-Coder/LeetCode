package Solution201_250;

import javax.xml.transform.Templates;

public class Solution238 {
	
    public int[] productExceptSelf(int[] nums) {
    	
    	if(nums.length<=1) return nums;
    
    	 int[] res = new int[nums.length];
    	 res[0] =1;
    	 
    	for(int i = 1; i<nums.length;i++){
    		res[i] = res[i-1]*res[i-1];
    	}
    	
    	for(int i = nums.length-1, tmp =1; i>=0;i--){
    		res[i] = res[i]*tmp;
    		tmp *= nums[i];
    	}
    	
    	return nums;
        
    }

}
