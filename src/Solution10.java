
public class Solution10 {
	
    public boolean isMatch(String s, String p) {
        if(p.length() == 0)
            return s.length() == 0;
 
        //p's length 1 is special case    
        if(p.length() == 1 || p.charAt(1) != '*'){
            if(s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
                return false;
            return isMatch(s.substring(1), p.substring(1));    
 
        }else{
            int len = s.length();
 
            int i = -1; 
            while(i<len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))){
                if(isMatch(s.substring(i+1), p.substring(2)))
                    return true;
                i++;
            }
            return false;
        } 
    	
    	/*if(p.charAt(0) == '.') {
    		  p = p.substring(0, 0)+s.charAt(0)+p.substring(1);
    	      return isMatch(s.substring(0,ls-1), p.substring(0,lp-1));
    		}
    	
    	if(s.charAt(0) != p.charAt(0) ){  		
    		if(p.charAt(1) != '*') return false;
    		else return isMatch(s.substring(0,ls-1), p.substring(2, lp-1));
    	}else{
    		
    		if(p.charAt(1) == '*')
    		{
    			int i = 1;
    			while(s.charAt(i) == s.charAt(0))
    			{
    				i++;
    			}
    			
    			System.out.println(i);
    			
    			return isMatch(s.substring(i, ls-1), p.substring(2, lp-1));
    			
    		}else{
    			
    			return isMatch(s.substring(1, ls-1), p.substring(1, lp-1));
    		}
    	}*/
            
    }

}
