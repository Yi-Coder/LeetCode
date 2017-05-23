package Solution101_150;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution123 {
	
    public int maxProfit(int[] prices) {
    	
    	int len = prices.length;
    	
    	int []maxtwo = {0,0};
    	
    	if(len<=1) return 0;
    	
    	if(len == 2) return prices[1]>prices[0]? prices[1]-prices[0]:0;
    	
    	int left = 0, right = 1;
    	
    	while(right<len){		
    		if(prices[right] <prices[left] ){
    			left = right;
    			right = right+1;
    			continue;
    		}
    		
    		while(right<len-1 && prices[right+1] > prices[right]){
    			//System.out.println(left);
    		   right= right+1;
    		}
    		
    		//System.out.println();
    		System.out.println(prices[right]-prices[left]);
    		
    		Arrays.sort(maxtwo);
    		returnmaxtwo(maxtwo,prices[right]-prices[left]);
    		left = right+1;
    		right= right+1;
    		 
    	}   	
    	return maxtwo[0]+maxtwo[1];
        
    }
    
    void returnmaxtwo(int []maxtwo, int val){
    	for(int i = 0; i<2; i++){
    		if(val>maxtwo[i]){
    			maxtwo[i] = val;
    			break;
    		}
    	}
    }

}
