import java.util.Stack;

public class Solution42 {
	 public int trap(int[] height) {
		 
		
		 int len = height.length;
		 if(len<=2) return 0;
		 int sum =0;
		 
		 int[] left = new int [len];
		 int[] right =new int [len];
		 
		 left[0] = height[0];
		 right[len-1] = height[len-1];
		 for(int i = 1;i<len; i++){
			 left[i] = Math.max(left[i-1], height[i]);
			 System.out.println(left[i]);
		 }
		 
		 for(int i = len-2;i>=0; i--){
			 right[i] = Math.max(right[i+1], height[i]);
			 System.out.println(right[i]);
		 }
		 
		
		 
		 for(int i = 0; i<len;i++){
			 sum += Math.min(left[i], right[i])- height[i];
		 }
		 
		 return sum;
	        
	    }

}
