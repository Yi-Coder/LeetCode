
import java.math.*;
public class Solution4 {
	
	   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		   double median = 0.0;
		   
		   int [] nums3 = new int[nums1.length+nums2.length];
		   
		   int i=0,j=0;
		   int k =0;
		   while(i<nums1.length || j<nums2.length){
			   
			   if(i == nums1.length){
				   while(j!=nums2.length)
				   {
					   nums3[k] = nums2[j];
					   k++;
					   j++;
				   }
				   break;
			   }
			   
			   if(j == nums2.length){
				    while(i  != nums1.length)
				   {
					   nums3[k] = nums1[i];
					   i++;
					   k++;
				   }
				   break;
			   }
			   
			   if(nums1[i] < nums2[j])
			   {
				   nums3[k] = nums1[i];
						i++;
				   		k++;
			   }else{
				   nums3[k] = nums2[j];
						j++;
				   		k++;
			   }
		   }
		   
		   for(i = 0;i<nums3.length;i++)
		   {
		   System.out.println(nums3[i]);
		   }
		   
			if(nums3.length%2 == 0)
			{
	            median =  (double) (nums3[(nums3.length-1)/2] + nums3[(nums3.length+1)/2])/2;
			}else
			{
			    	median =  (double) (nums3[nums3.length/2]);
			}
		 
		   System.out.println(median);
		   return median;
		    
	    }
}
