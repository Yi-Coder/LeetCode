package Solution201_250;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {
	
    public static boolean isIsomorphic(String s, String t) {
    	
    	int len1= s.length();
    	
    	Map<Character, Character> map = new HashMap<Character, Character>();
    	for(int i = 0; i<len1;i++ ){
    		if(!map.containsKey(s.charAt(i)) && !map.values().contains(t.charAt(i))){
    			map.put(s.charAt(i), t.charAt(i));
    		}
    	}
    	
    	StringBuilder tmp = new StringBuilder();
    	
    	for(int j = 0;j<len1;j++){
    		tmp.append(map.get(s.charAt(j)));
    	}
    	
    	return tmp.toString().equals(t);
        
    }

}
