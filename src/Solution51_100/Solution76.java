package Solution51_100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution76 {

    public static String minWindow(String s, String t) {
    	
    	String result = "";
    	
    	if(t.length()>s.length()) return result;
    	
    	HashMap<Character, Integer> mapt = new HashMap<Character,Integer>();
    
    	for(int i = 0; i<t.length();i++){
    		if(mapt.containsKey(t.charAt(i))){
    			mapt.put(t.charAt(i), mapt.get(t.charAt(i))+1);
    		}else mapt.put(t.charAt(i), 1);
    	}
    	int left = 0; 
    	int right = 0;
    	int counter = 0;
    	int min = Integer.MAX_VALUE;
    	
    	HashMap<Character, Integer> maps = new HashMap<Character,Integer>();
    	while(right<s.length()){
    		if(mapt.containsKey(s.charAt(right))){   			
    			if(maps.containsKey(s.charAt(right))){
    				if(maps.get(s.charAt(right)) <mapt.get(s.charAt(right))) counter++;
    				maps.put(s.charAt(right), maps.get(s.charAt(right))+1);
    			}else{
    				 maps.put(s.charAt(right), 1);
    				 counter++;
    			}
    			
    		}
    		
    		if(counter == t.length()){
    			while(!maps.containsKey(s.charAt(left))||maps.get(s.charAt(left))>mapt.get(s.charAt(left))){
    				if(maps.containsKey(s.charAt(left)) && maps.get(s.charAt(left))>mapt.get(s.charAt(left))){
    					maps.put(s.charAt(left), maps.get(s.charAt(left))-1);
    				}
    				left++;
    			}
				if(right-left+1<min){
					min = right-left+1;
					result= s.substring(left,right+1);
				}
    		}
    		right++;
    	}
    	return result;
        
    }

}
