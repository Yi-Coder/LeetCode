package Solution101_150;

public class Solution122 {
	
    public int maxProfit(int[] prices) {
    	  	
    	if(prices.length <=1) return 0;
      	int max = 0;
    	int start = 0;
    	int end = 1;
    	
    	while(end< prices.length){
    		
    		while( prices[end]<prices[end-1] ){
    			end++;
    			//
    		}
    		start = end-1;
    		
    		while( end< prices.length&&prices[end]>prices[end-1]  ){
    			end++;
    			System.out.println(end);
    		}
    		max += prices[end-1]-prices[start];
    		start = end+1;
    		end = start;		
    	}
    	
    	return max;
        
    }

}
