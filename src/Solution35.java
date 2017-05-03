
public class Solution35 {
	
	   public int searchInsert(int[] nums, int target) {
		   
		   int start = 0;
		   int end = nums.length-1;
		   int mid = (start+end)/2;
		   int pivot = -1;
		   
		   if(end == 0 && nums[0] < target) return 1; 
		   if(end == 0 && nums[0] > target) return 0; 
		   
		   	while(start<=end){
		   		if(nums[mid] == target){
		   			pivot = mid;
		   			break;			
		   		}else if(nums[mid] < target){
		   			start = mid+1;
		   			mid = (start+end)/2;
		   		
		   		}else{
		   			end = mid-1;
		   			mid = (start+end)/2;
		   		}
		   	
		   }
		   	
		   	System.out.println(mid);
		   	System.out.println(start);
		   	System.out.println(end);
		   	
		   	if(pivot == -1){
		   		
		   		if(nums[mid] > target) pivot = start;
		   		if(nums[mid] < target) pivot = end+1;
		   	}
		   	
		   	return pivot;
	        
	    }

}
