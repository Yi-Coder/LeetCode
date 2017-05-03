
public class Solution27 {
	
	   public int removeElement(int[] nums, int val) {
		   
		   int start = 0;
		   int end = nums.length-1;
		   int temp;
		   
		   if (end < 0) return 0;
		   
		   while(start<end){   
			   if(nums[start] == val){
				   if(nums[end] == val){
					   --end;
					   //break;
				   }else{
					   temp = nums[end];
					   nums[end] = nums[start];
					   nums[start] = temp;
					   end--;
					   start++;
				   }
			   }else{
				   start++;
			   }
		   }
		   
		   return  end+1;
	        
	    }

}
