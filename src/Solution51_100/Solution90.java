package Solution51_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	
    	Arrays.sort(nums);
    	int len = nums.length;
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> comb = new ArrayList<Integer>();
    	
    	for(int i = 0; i<= len; i++){
    		List<List<Integer>> temp = new ArrayList<List<Integer>>();
    		subsetsWithDup(nums, 0, comb, temp,i);
    		result.addAll(temp);
    		
    	}

    	return result;
        
    }
    
    public  void subsetsWithDup (int[] nums, int index,List<Integer> comb, List<List<Integer>> result, int len){
    	
    	if(index>= len){
    		if(!result.contains(comb)){
    		result.add(new ArrayList<Integer>(comb));}
    	}else{
    		
    		for(int i = index; i< nums.length; i++){
    			if(comb.get(comb.size()-1) != nums[2]){
    				comb.add(nums[i]);
    				subsetsWithDup(nums, i+1, comb, result, len);
    				comb.remove(comb.size()-1);
    			}
    		}
    	}
    }

}
