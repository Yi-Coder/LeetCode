package Solution201_250;

import java.util.ArrayList;
import java.util.List;

public class Solution228 {
	
    public List<String> summaryRanges(int[] nums) {
    	List<String> result = new ArrayList<String>();
    	if(nums.length<=0) return result;

    int index = 0;
    int i = 0;
    for(i = 0; i<nums.length-1; i++){
    	if((long)nums[i+1]-(long)nums[i]>1){
    		if(i==index){
    			result.add(nums[index]+"");
    		}else {
    			result.add(nums[index]+"->"+nums[i]);			
    		}
    		index = i+1; 
    	}   	
    }
    
     if(i == index) result.add(nums[index]+"");
     else result.add(nums[index]+"->"+nums[i]);

    	return result;
        
    }

}
