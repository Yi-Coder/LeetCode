package Solution251_300;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

public class Solution290 {
	
    public static boolean wordPattern(String pattern, String str) {	
    	String[] parts = str.split(" ");
    	if(parts.length == 1 && pattern.length()==1) return true;
    	
    	if(parts.length != pattern.length()) return false;
    	
    	Map<Character, String> map = new HashMap<Character, String>();
    	
    	for(int i =0 ;i<pattern.length();i++){
    		if(map.containsKey(pattern.charAt(i))){
    			if(!parts[i].equals(map.get(pattern.charAt(i)))) return false;
    		}else{
    			if(!map.values().contains(parts[i])) map.put(pattern.charAt(i), parts[i]);
    			else return false;
    	}
    	}
    	
    	return true;
        
    }

}
