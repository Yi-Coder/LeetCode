import java.util.Arrays;
import java.util.Currency;

public class Solution45 {
	
	 public int jump(int[] nums) {    
	        int len = nums.length;
	        if(len<=1) return 0;
	        
	        int Fathest = nums[0];
	        
	        int lastmax = Fathest;
	        
	        int jump = 1;
	        for(int i= 0;i<len;i++){
	        	if(nums[i]+i > Fathest){
	        		
	        		Fathest = nums[i]+i;	        		
	        	}
	        	if(i == lastmax){
	        		jump++;
	        		lastmax =Fathest;
	        	}
	        	System.out.println(Fathest);
	        	if(Fathest >= len -1) {
	        		jump++;
	        		break;
	        	}
	        }
	        
	        return jump;	        
	    }

}
