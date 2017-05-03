
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution15 {

	public List<List<Integer>> threeSum(int[] nums) {
		
		Arrays.sort(nums);
	
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
				if(nums[start]+nums[end]+nums[i] == 0)
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
					 
				}else if(nums[start]+nums[end]+nums[i]  < 0){					
					start++;					
				}else if (nums[start]+nums[end]+nums[i] > 0){
					end--;
				}
			}
		}
		return ll;
	}

}
