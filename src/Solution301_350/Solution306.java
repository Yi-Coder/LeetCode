package Solution301_350;

import javax.print.attribute.standard.NumberUpSupported;

public class Solution306 {
	
    public boolean isAdditiveNumber(String num) {  
    	int n = num.length();
    	for(int i = 1 ; i<=n/2;i++){
    		for(int j = i+1; j<n; j++){
    			if(isValid(i, j, num)) return true;
    		}
    	}
    	
    	return false;
    }
    
    boolean isValid(int first, int second, String num){
    	if(num.charAt(0) == '0' && first>1) return false;
    	if(num.charAt(first) == '0' && second-first >1) return false;
    	
    	 String sum;
         Long x1 = Long.parseLong(num.substring(0, first));
         Long x2 = Long.parseLong(num.substring(first, second));
         
         for(int start = second; start != num.length(); start += sum.length() ){
        	 x2 = x1+x2;
        	 x1 = x2-x1;
        	 sum = x2.toString();
        	 if(!num.startsWith(sum,start)) return false;
         }
    	return true;
    }

}
