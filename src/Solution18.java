
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution18 {
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int fourlength = nums.length;
        
        for(int i = 0;i<fourlength-3;i++){
        	
        	if (i != 0 && nums[i] == nums[i - 1]) {
 				continue; 
 			}
               	
        	List<List<Integer>> temp1 = threesum(Arrays.copyOfRange(nums, i+1, fourlength), target-nums[i]);
        	
        	//System.out.println(temp1);
        	
        	
        	
        	for(List<Integer> list: temp1){
        		boolean flag = false;
        		list.add(nums[i]);
        		Collections.sort(list);
        		
        		//System.out.println(nums[i]);
        		//System.out.println(list);
        		
        		//System.out.println(result);
        		
        		for(List<Integer> tlist : result){
        			if(tlist.equals(list))
        			{
        				flag = true;
        				//continue;
        			}
        		}
        		
        		if(!flag)  result.add(list);
        		
        	}
        	
        	
        }
        
        return result;
    }
    
    public List<List<Integer>>  threesum(int[] nums, int target) {
    	
        List<List<Integer>> ll = new ArrayList<List<Integer>>();

 		int len = nums.length;
 		
 		int start;
 		int end;

 		for (int i = 0; i < len-2; i++) {
 			
 			if (i != 0 && nums[i] == nums[i - 1]) {
 				continue; 
 			}
 			    start = i+1; 
 			    end = len -1;
 			while(start < end ) {
 				if(nums[start]+nums[end]+nums[i] == target)
 				{
 					List<Integer>  temp = new ArrayList<Integer>();
 					
 					temp.add(nums[start]);
 					temp.add(nums[end]);
 					temp.add(nums[i]);
 				
 					ll.add(temp);
 					
 					start++;
 					end--;
 					
 					 while(start<end&&nums[start] == nums[start-1]){	
 						 start++;
 					 }
 					 
 					 while(start<end&&nums[end] == nums[end+1])
 					 {					
 							 end--;				 
 					 }
 					 
 				}else if(nums[start]+nums[end]+nums[i]  < target){					
 					start++;					
 				}else if (nums[start]+nums[end]+nums[i] > target){
 					end--;
 				}
 			}
 		}
 		return ll;
		
	}
        

}
