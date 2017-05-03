import java.util.*;

public class Solution7 {
	
    public int reverse(int x) {
    	int sum = 0;
    	
    	if( x>0)
    	{
    	String s = Integer.toString(x);
    	for(int i = s.length()-1;i>=0;i--)
    	{
    		if(sum <Integer.MAX_VALUE)
    		{
    			sum += Character.getNumericValue(s.charAt(i))*Math.pow(10.0, i);
    		}
    		else return 0;
    	}    	
    	return sum;
    	}else{
    		
    		String s = Integer.toString(-x);
        	for(int i = s.length()-1;i>=0;i--)
        	{
        		if(sum <Integer.MAX_VALUE)
        		{
        			sum += Character.getNumericValue(s.charAt(i))*Math.pow(10.0, i);
        		}
        		else return 0;
        	}    	
    		
        	return -sum;
    	}
    }

}
