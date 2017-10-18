package Solution151_200;

public class Solution162 {
	
    public int findPeakElement(int[] nums) {
    	
    	int len = nums.length;
    	if(len<=1) return 0;
    	
    	if(len == 2) return nums[0]>nums[1]? 0:1;
    	
    	if(nums[0]>nums[1]) return 0;
    	if(nums[len-1]>nums[len-2]) return len-1;
    	
    	return findpeak(nums, 0, len-1);
    }
    
    
    public int findpeak(int[] nums, int start, int end){
    	if(start>end) return -1;
    	
    	int mid = (start+end)/2;
    	
    	if(mid+1<=end&&mid-1>=start&&nums[mid]> nums[mid+1] && nums[mid]>nums[mid-1]) return mid;
    	else {
    		int left = findpeak(nums, start, mid-1);
    		int right = findpeak(nums, mid+1, end);
    		return left == -1? right:left;
    	}
    }

}
