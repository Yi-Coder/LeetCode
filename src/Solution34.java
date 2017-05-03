
public class Solution34 {
	
public int[] searchRange(int[] nums, int target) {
	
	
	int []index = new int[2];
	index[0] = -1;
	index[1]= -1;
	
	int len = nums.length;
	if (len == 0) return index;
	
	
	int povit = binarysearch(nums,0,len-1, target);
	
	//System.out.println(povit);
	
	if(povit == -1) return index;
	else{
		index[0] = povit;
		index[1] = povit;
		
		int left = povit-1;
		int right = povit+1;
		
		while(left>=0){
			int templ= binarysearch(nums,0,left, target);
			if(templ != -1){
				index[0] = templ;
				left = index[0] - 1;
			}else {
				break;
			}
		}
		
		while(right<=len-1){
			int tempr = binarysearch(nums,right,len-1, target);
			if(tempr != -1){
				index[1] = tempr;
				right = index[1]+1;
			}else {
				break;
			}
		}
		
	}
 
     return index;
        
    }

public int binarysearch(int []nums,int s, int e, int target){

int start = s;
int end = e;
int mid = (start+end)/2;

int pivot = -1;
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
	
	return pivot;
}

}
