package Solution101_150;

public class Solution121 {
	
	  public int maxProfit(int[] prices) {
		  
		  if(prices.length<=1) return 0;
		  
		  int max = 0;
		  int leftmin = prices[0];
		  
		  for(int i = 1; i <prices.length;i++){
			  
			  if(prices[i]-leftmin > max){
				  max = prices[i]-leftmin;
			  }
			  
			  leftmin = prices[i] < leftmin ? prices[i]:leftmin;
			  System.out.println(leftmin);
		  }
		  
		  return max;
	        
	    }

}
