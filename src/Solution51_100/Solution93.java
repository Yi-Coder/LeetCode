package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution93 {
	
    public List<String> restoreIpAddresses(String s) {

    	List<String> result = new ArrayList<String>();
   
    	if(s.length()<=3 || s.length()> 12 ) return result;
    	
    	StringBuffer ip = new StringBuffer();
    	
    	IpRes(0, s, ip, 0, result);
    	
    	return result;
        
    }
    
    public void IpRes(int curIndex, String s, StringBuffer ip, int curDot, List<String> result){
    	
    	//System.out.println(curIndex);
    	
    	if(curDot == 3){
    		if(Integer.parseInt(s.substring(curIndex)) <= 255 && Integer.parseInt(s.substring(curIndex)) > 0 && s.charAt(curIndex) !='0' || ( s.charAt(curIndex) =='0' && s.substring(curIndex).length() == 1)  ){
    			//System.out.println(ip.toString());   
    			ip.append(s.substring(curIndex));
        		result.add(new String(ip));	
        		ip.delete(ip.length()-s.substring(curIndex).length(),ip.length());
    		} 
    	}else if(curIndex+1< s.length()) {
    		if(s.charAt(curIndex) =='0'){
    				ip.append("0"+".");
    				IpRes(curIndex+1, s, ip, curDot+1, result);
    				ip.delete(ip.length()-2, ip.length());
    			}else{	   		
    				for(int i = curIndex+1; i< s.length() && i<=curIndex+3  ;i++){
    				
    					if(Integer.parseInt(s.substring(curIndex,i)) <= 255){
    						ip.append(s.substring(curIndex,i)+".");
    						//System.out.println(i);
    						IpRes(i, s, ip, curDot+1, result);
    						//System.out.println(ip.toString());  
    						ip.delete(ip.length()-1-i+curIndex, ip.length());
	    				
	    			}
	    			
	    		}
    		
    		 }
    	}
    	
    }
    
}
