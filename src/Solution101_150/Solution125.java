package Solution101_150;

public class Solution125 {
    public boolean isPalindrome(String s) {
    	
    	int len = s.length();
    	if(len<=1) return true;
    	
    	int start = 0,end = len-1;
    	
    	while(start<= end && start<=len-1&& end >=0 ){
    		
    		while(start<=len-1 && !Character.isLetterOrDigit(s.charAt(start))){
    			start++;
    		}
    		
    		while(end >=0 && !Character.isLetterOrDigit(s.charAt(end))){
    			end--;
    		}
    		
    		if(start<=len-1 && end >=0){
    			if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))){
    				start++;
        			end--;
    			}else {
        		return false;
    			}
    		}
    	}
    	
    	return true;
        
    }
    

}
