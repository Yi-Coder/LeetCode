package Solution201_250;

import java.util.HashMap;
import java.util.Map;

public class Solution242 {
	
	   public static boolean isAnagram(String s, String t) {
		   
		   if(s.length() != t.length()) return false;
		   Map<Character,Integer> map = new HashMap<Character, Integer>();
		   
		   for(int i = 0; i<s.length();i++){
			   if(map.containsKey(s.charAt(i))){
				   map.put(s.charAt(i), map.get(s.charAt(i))+1);
			   }else map.put(s.charAt(i), 1);
		   }
		   
		   for(int i = 0; i<t.length(); i++){
			   if(map.containsKey(t.charAt(i))){
				   if(map.get(t.charAt(i))-1 >0){
					   map.put(t.charAt(i), map.get(t.charAt(i))-1); 
				   } else if(map.get(t.charAt(i))-1 ==0){
					   map.remove(t.charAt(i));
				   }
			   }else return false;
		   }
		   
		   return map.isEmpty();
	        
	    }

}
