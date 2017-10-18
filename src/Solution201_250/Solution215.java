package Solution201_250;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
    		
    	 return findk(nums,0, nums.length-1,k);
    }
    
    public static int findk(int[]nums, int start, int end, int k){
    	if(k <=0 && k>=nums.length) return -1;
    	if(start == end && k == 1) return nums[end];
    	
    	int pos = partition(nums, start, end);
    	int len = end - pos+1;
    	if(len == k)  return nums[pos];
    	else if(len < k)
    		return findk(nums, start, pos-1, k-len);
    	else return findk(nums, pos+1, end, k);
    }
    
    public static void quicksort(int[]nums,int start, int end){
    	if(nums.length<=1 || start >= end) return;
    	int pi = partition(nums, start, end);
    	
    	if(start < pi -1) quicksort(nums, start, pi-1);
    	if(end > pi+1)quicksort(nums, pi+1, end);
    }
    
    public static int partition(int[]nums,int i ,int j){
    		int pivot = nums[i];
    		int left = i+1;
    		int right = j; 		
    		while(left<=right){
    			while(left<=right && nums[left]<=pivot) left++;
    			while(left<=right && nums[right]>=pivot) right--;
    			
    			if(left<=right){
    				int tmp = nums[left];
    				nums[left]=nums[right];
    				nums[right]=tmp;
    				left++;
    				right--;
    			}
    		}   		
    		nums[i] = nums[left-1];
			nums[left-1]= pivot;			
			return left-1;
    				
    }
    
}
