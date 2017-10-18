package Solution151_200;

public class Solution189 {
	
	   public void rotate(int[] nums, int k) {
		   
		   k = k% nums.length;
		   
		   for(int i = nums.length-k; i<nums.length;i++){
			   int temp = nums[i];
			   for(int j = i ; j>=i-nums.length+k+1;j--){
				   //System.out.println(j);
				   nums[j] = nums[j-1]; 
			   }
			   nums[i-nums.length+k] = temp;   
		   }
		   
		   for(int i: nums){
			   System.out.println(i);
		   }
	        
	    }

}
