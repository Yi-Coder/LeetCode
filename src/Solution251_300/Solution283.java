package Solution251_300;

import javax.xml.stream.events.StartDocument;

public class Solution283 {
	
    public void moveZeroes(int[] nums) {
    	
    	if(nums.length<=1) return;
    	
    		int right = nums.length -1;
    		
    		int walker =  nums[nums.length -1]== 0? nums.length-2:nums.length -1;
    		
    		while(walker>=0){
    			if(nums[walker]==0){
    				for(int start = walker; start<right;start++){
    					int tmp =  nums[start];
    					 nums[start] =  nums[start+1];
    					 nums[start+1] = tmp;
    				}
    				right--;
    				walker--;
    			} else walker--;
    		}
    				
    }

}
