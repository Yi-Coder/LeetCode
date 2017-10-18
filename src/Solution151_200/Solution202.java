package Solution151_200;

import java.util.ArrayList;

public class Solution202 {
	
    public boolean isHappy(int n) {
    	
    	ArrayList<Integer> exist = new ArrayList<Integer>();
    	
    	return helper(n, exist);
        
    }
    
    public boolean helper(int n, ArrayList<Integer> exist){
    	
    	if(exist.contains(n)) return false;
    	else{
    		exist.add(n);
    		int sum  = 0;
    		
    	  	while(n != 0 ){
        		sum = (int)Math.pow(n%10, 2);
        		n = n/10;	
        	}
    	  	
    	  	System.out.println(sum);
        	
        	if(sum == 1) return true;
        	else return helper(sum, exist);
    	}
  
    }

}
