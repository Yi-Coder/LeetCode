package Solution51_100;

public class Solution75 {
	   public void sortColors(int[] nums) {
		   
		   int len = nums.length;
		   if(len<=1) return;
		   
		   int count0=0;
		   int count1=0;
		   int count2=0;
		   
		   for(int i =0 ;i < len; i++){			   
			   switch (nums[i]) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			default:
				break;
			}  
		   }
		   
		   for(int j = 0; j<count0;j++){
			   nums[j] = 0;
		   }
		   
		   for(int j = count0; j<count0+count1;j++){
			   nums[j] = 1;
		   }
		   
		   for(int j = count0+count1+count2; j<count0+count1+count2;j++){
			   nums[j] = 2;
		   }
	        
	        
	    }
}
