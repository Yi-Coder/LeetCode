package Solution51_100;

public class Solution84 {
	
	   public int largestRectangleArea(int[] heights) {
		   
		   if(heights.length==0) return 0;
		   if(heights.length==1) return heights[0];
		   
		   if(heights.length==2) return Math.abs(heights[0]-heights[1])> Math.min(heights[0], heights[1])? Math.max(heights[0], heights[1]): 2*Math.min(heights[0], heights[1]);
		   
		   return maxrect(heights,0,heights.length-1);

	    }
	   
	   public int maxrect(int[] heights, int start, int end){
		   
		   if(start>=end) return heights[(start+end)/2];
		   
		   int index = findmin(heights, start,end);		   
		   
		   int max = Math.max(Math.max(heights[index]*(end-start+1), maxrect(heights,start,index-1)), maxrect(heights,index+1,end));
		   return max;
	   }
	   
	  public int findmin(int[] heights, int start, int end){
		  
		  if(start==end) return start;
		  
		  int small = heights[start];
		  int index = start;
		  
		  for(int i = start; i<=end; i++){
			  if(heights[i]< small) {
				  small = heights[i];
				  index = i;
			  }
		  }
		  return index;
	  }

}
