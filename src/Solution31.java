
public class Solution31 {
	 public void nextPermutation(int[] nums) {
				 
		 int length = nums.length;
		 int index1 = 0;
		 
		 int []temp = new int[length];
		 
		for(int i = 0; i< length; i++){
			temp[i] = nums[i];
		}
		 
		 for(int i = length-1 ; i > 0 ; i--)
		 {
			if (nums[i] > nums[i-1])
			{
				index1 = i;
				break;
			}
		 }
		 
		 System.out.println(index1);
		 
		 if (index1 != 0 ){
			 
			 int index2  = length-1;
			 
			 while(index2 > index1-1){
				 if(nums[index2] <= nums[index1-1]){
					 index2--;
				 }else break;
			 }
			 	System.out.println(index2);
		 
				 int k = index2;
				 int start = index1-1;
				 nums[start] = temp[index2];
				 start = start+1;
				 k = length-1;
				 
				 for(;k > index2;){
					 nums[start++] = temp[k--];
					// System.out.println(temp[k]);
				 }
			 
				 nums[start] = temp[index1-1];
				 //System.out.println(temp[index1]);
				 start = start+1;
							 
				 for(int end = index2-1; end>=index1; end--){
					 nums[start++] = temp[end];
					// System.out.println(temp[end]);
				 }
				 
		 }else{ 
			 for(int start = 0, end = length - 1; start<end; start++, end--){
				 int temp1 = nums[start];
				 nums[start] = nums[end];
				 nums[end] = temp1;			
			 }	 
		 }
		 
		 // [1,3,2] --> [2,1,3]
		 //[1,2,5,4,3,2] -->
		 
	
	
	 }

}
