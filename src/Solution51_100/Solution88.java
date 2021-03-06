package Solution51_100;

public class Solution88 {
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	int right = m+n-1;
    	
    	int index1 = m-1;
    	int index2 = n-1;
    	
    	while(index1>=0 && index2 >= 0){
    		
    		if(nums1[index1] < nums2[index2]){
    			nums1[right--] = nums2[index2--];
    		}else{
    			nums1[right--] = nums1[index1--];
    		}

    	}
    	
    	while(index1>=0){
    		nums1[right--] = nums1[index1--];
    	}
    	

    }

}
