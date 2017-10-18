package Solution301_350;

import javax.print.attribute.standard.NumberUpSupported;

public class NumArray {
	
	int[] nums;
    public NumArray(int[] nums) {
    	
    	for(int i = 1; i<nums.length;i++){
    		nums[i] +=nums[i-1];
    	}
    	 this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        
    	 if(i == 0)
    	        return nums[j];
    	    
    	    return nums[j] - nums[i - 1];
    	}
    }

}
