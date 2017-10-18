package Solution151_200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution187 {
	
	  public List<String> findRepeatedDnaSequences(String s) {
		  
		  List<String> result = new ArrayList<String>();
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  
		  int len = s.length();
		  
		  if(len<10) return result;
		  
		  for(int i = 0 ; i<len-9;i++){
			  if(map.containsKey(s.substring(i,i+10))){
				  
				  if(!result.contains(s.substring(i,i+10))) result.add(s.substring(i,i+10));
			  }else{
				  map.put(s.substring(i,i+10), 1);
			  }
		  }
		  
		  return result;
		  
		  
	        
	    }

}
