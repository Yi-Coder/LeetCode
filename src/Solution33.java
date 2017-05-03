
public class Solution33 {
	
	   public int search(int[] nums, int target) {
		   
		   if(nums.length == 0) return -1;
		   
		   int index = -1;
		   
		   int start = 0, end = nums.length-1;
		   
		   int povit = 0;
		   
		   for(;start<end; start++, end--){
			   if(nums[start]>nums[start+1]) {
				povit = start+1;
				break;
			   }
			   if(nums[end-1]>nums[end]) {
					povit = end;
					break;
				   }
		   }
		   System.out.println(povit);
		   
		   if(target >= nums[povit] && target <= nums[nums.length-1] ){
			   
			   start = povit; 
			   end = nums.length-1;
			   int mid = (start+end)/2;
			   
			   while(start<=end){
				   if(target == nums[mid]){
				   index = mid;
				   break;  
			   }else if(target > nums[mid]){
				   start = mid+1;
				   mid = (start+end)/2;
				   
			   	}else{
			   		end = mid-1;
			   		mid = (start+end)/2;   
			   		}
			   }
			   
		   }else{
			   
			   start = 0; 
			   end = povit-1;
			   int mid = (start+end)/2;
			   
			   while(start<=end){
				   if(target == nums[mid]){
				   index = mid;
				   break;  
			   }else if(target > nums[mid]){
				   start = mid+1;
				   mid = (start+end)/2;
				   
			   	}else{
			   		end = mid-1;
			   		mid = (start+end)/2;   
			   		}
			   }
			   
		   }
		   		   
		   return index;
	        
	    }

}
