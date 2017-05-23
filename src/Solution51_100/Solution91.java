package Solution51_100;

public class Solution91 {
    public int numDecodings(String s) {
    	
    	int len = s.length();
    	  
    	if(len == 0 ) return 0;
    	
    	if(len == 1 && s.charAt(0) != '0') return 1;
    	
    	if(len == 1 && s.charAt(0) == '0') return 0;
    	
    	int [] result = new int [len];
		
		if(s.charAt(0) != '0' ) result[0] = 1;
    	else return 0;
		
		
		if(s.charAt(1) != '0'){
			if(Integer.parseInt(s.substring(0,2))<=26 && Integer.parseInt(s.substring(0,2))>10) result[1] = 2;
			else result[1] = 1;
		} else {
			
			if(Integer.parseInt(s.substring(0,2))<=26){
				result[1] = result[0];
			} else result[1] = 0;
			
		}
			
		
		int i = 2;
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		
        	while( i < len){
        		if(s.charAt(i) == '0'){
        			if(Integer.parseInt(s.substring(i-1,i+1)) != 0 ){
        				
        				if(Integer.parseInt(s.substring(i-1,i+1)) <= 26){
        					result[i] = result[i-2];
        
        				}else result[i] = 0;
        				
        			}else result[i] = 0;
        		} else if(Integer.parseInt(s.substring(i-1,i+1)) <= 26 && Integer.parseInt(s.substring(i-1,i+1))>10 ) result[i] = result[i-1] + result[i-2];
                		else result[i] = result[i-1];	
              
        		i++; 
        	}
        	
        	
 
    	return result[len-1];
 
    }

}
