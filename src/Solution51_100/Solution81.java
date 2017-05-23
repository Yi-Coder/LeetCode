package Solution51_100;

public class Solution81 {
	
	  public boolean search(int[] nums, int target) {
		  
		  
		  if(nums.length <=0) return false;
	        
	        if(nums.length==1) return nums[0]==target? true:false;
	   	  
			  int pivot = nums.length-1;
			  for(int i = 0; i<nums.length-1; i++){
				  if(nums[i] > nums[i+1]){
					  pivot = i; 
					  break;
				  } 
			  }
			  
			  System.out.println(pivot);
		  
		  return (bisearch(nums,0,pivot ,target) || bisearch(nums,pivot+1, nums.length-1, target));
	        
	    }
	  
	  
	  public boolean bisearch(int [] nums, int start, int end, int target){
		  
		  int left = start;
		  int right = end;
		  int mid = (left+right)/2;
		  
		  while(left<=right){
			  
			  if(nums[mid] == target) return true;
			  else if(nums[mid] > target){
				  right = mid-1;
				  mid = (right+left)/2;
			  }else{
				  
				  left = mid+1;
				  mid = (right+left)/2;  
			  }
		  }
		  
		  return false;
		  
		  
	  }

}
