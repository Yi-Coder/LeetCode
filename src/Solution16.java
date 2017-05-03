
import java.util.Arrays;


public class Solution16 {

	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int min = Integer.MAX_VALUE;
        int len = nums.length;
		
		int start;
		int end;
		
		int sum = Integer.MAX_VALUE ;
		
     for (int i = 0; i < len-2; i++) {
			
			if (i != 0 && nums[i] == nums[i - 1]) {
				continue; 
			}
			    start = i+1; 
			    end = len -1;
			while(start < end ) {
				sum  = nums[start]+nums[end]+nums[i] ;
				if(sum == target)
				{
							
							return sum;
							
				}else if( sum <target){
					if(Math.abs(sum - target) < min){
						 min=Math.abs(sum - target);
					}
					start++;
				}else if (sum > target){
					if(Math.abs(sum - target) < min){
						 min= Math.abs(sum - target);
					}
					end--;
				}
			}
			}
     return sum-target>0? target+min:target - min;
    }
}

