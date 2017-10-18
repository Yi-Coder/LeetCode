package Solution201_250;

import java.util.ArrayList;
import java.util.List;

public class Solution229 {
    public List<Integer> majorityElement(int[] nums) {
      	ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums.length==0) return res;
    
    	int []count = new int[2];
    	int [] x = new int[2];
    	x[0] = nums[0];
    	x[1] = nums[0];
    	
    	for(int i = 0; i<nums.length;i++){
    		if(nums[i] == x[0]){
    			count[0]++;
    		}else if(nums[i] == x[1]){
    			count[1]++;
    		}else if(count[0]==0){
    			x[0]=nums[i];
    			count[0]=1;
    		}else if(count[1]==0){
    			x[1]=nums[i];
    			count[1]=1;
    		}else{
    			count[0]--;
    			count[1]--;
    		}
    	}
    	count[0] = 0;
    	count[1] =0;
    	
    	for(int i = 0; i<nums.length;i++){
			if(nums[i]==x[0]) count[0]++;
			if(nums[i]==x[1]) count[1]++;
			
			if(count[0]> nums.length/3 && !res.contains(x[0])) res.add(x[0]);
			if(count[1]> nums.length/3 && !res.contains(x[1])) res.add(x[1]);
		}
    	
    	
    	
    	return res;
    	
    }
}
