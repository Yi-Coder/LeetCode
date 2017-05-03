
public class Solution26 {
    public int removeDuplicates(int[] nums) {
    	
       	int len = nums.length;
    	boolean flag = false;
    	
    	int i = 0;
    	
    	while(i<len-1){
    		int start = nums[i];
    		int j = 1;
    		while(start == nums[i+j]){
    			j++;
    			flag =true;
    			if(i+j >= len) break;
    		}
    		
    		if(flag) {
    		for(int k = i+j,p = i+1 ;k<len&&p<len;k++,p++){
    			nums[p] = nums[k];
    		}
    		len = len - j+1;
    		i=0;
    		flag = false;
    		
    		}else i=i+1;
    		
    	}
    	return len;  
    }

}
