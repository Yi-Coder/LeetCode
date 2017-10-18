package Solution101_150;

import java.util.BitSet;

public class Solution128 {
	
    public int longestConsecutive(int[] nums) {
    	
    	boolean [] existing = new boolean[nums.length+1];
    	
    	for(int i =0 ;i<nums.length;i++){
    		existing[((nums[i]+(Integer.MAX_VALUE/nums.length)*nums.length)%nums.length)] = true;
    	}
    	
    	int count = 0;
    	int maxcount = 0;
    	for(int i =0 ;i <nums.length;i++){
    		if(existing[i] == true) count++;
    		else{
    			maxcount = count>maxcount?count:maxcount;
    			count = 0;
    		}
    	}
    	
    	maxcount = count>maxcount?count:maxcount;
    	
    	return maxcount;
        
    }

}
