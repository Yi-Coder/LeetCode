package Solution151_200;

public class Solution179 {
	
	 public String largestNumber(int[] nums) {
		 
		 StringBuilder sb = new StringBuilder();

		 for(int i = 0; i<nums.length;i++){
			 for(int j = 0; j<nums.length-1-i;j++){
				 if(!compare(nums[j], nums[j+1])){
					 int temp = nums[j+1];
					 nums[j+1] = nums[j];
					 nums[j] = temp;
				 }			 
			 }
			 sb.insert(0, Integer.toString(nums[nums.length-1-i]));
		 }
		 
		 
		 int index = -1;
		 for(int i =0 ;i<sb.length();i++){
			 if(sb.charAt(i)!='0') {
				 index = i;
				 break;
			 }
		 }
		 if(index == -1) return "0";
		 else  return sb.toString();
		
	        
	    }
	 
	 
	 
	 public boolean compare(int a, int b) {
		 Long temp1 = Long.parseLong(Integer.toString(a)+Integer.toString(b));
		 Long temp2 = Long.parseLong(Integer.toString(b)+Integer.toString(a));
		 return temp1>=temp2? true:false;
	}

}
