package Solution251_300;

public class Solution268 {
	
    public int missingNumber(int[] nums) {
    	
    	int n = nums.length+1;
    	int sum = (1+n)*n/2;
        
    	int result = 0;
    	for(int i: nums){
    		result += i;
    	}
    	
    	return sum -result;
    }

}
