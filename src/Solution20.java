import java.util.ArrayList;

import javax.print.attribute.standard.Chromaticity;



public class Solution20 {
	
    public boolean isValid(String s) {
    	
    	
    	ArrayList<Character> l = new ArrayList<Character>();
    	int len = s.length();
    	
    	for(int i =0;i<len;i++){
    	  if(l.isEmpty()){
    		  l.add(s.charAt(i));
    	  }else{
    		  if(l.get(l.size()-1) == '(' && s.charAt(i) ==')'||l.get(l.size()-1) == '[' && s.charAt(i) ==']'||l.get(l.size()-1) == '{' && s.charAt(i) =='}'){
    			  l.remove(l.size()-1);
    		  }else{
    			  l.add(s.charAt(i));
    		  }
    	  }
    	}
    	
    	
    	return l.isEmpty();
        
    }

}
