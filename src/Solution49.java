import java.awt.event.WindowFocusListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.print.StreamPrintService;

public class Solution49 {
	
    public List<List<String>> groupAnagrams(String[] strs) {
        
    	List<List<String>> result = new ArrayList<List<String>>();
    	
    	HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();
    	
    	int len = strs.length;
    	
    	if(len == 0) return result;
    	char[] temp;
    	String s;
    	for(int i = 0 ;i<len;i++ ){
    		temp = strs[i].toCharArray();		
    		Arrays.sort(temp);
    		s =  String.valueOf(temp);
    		
    		if(hmap.keySet().contains(s)){
    			hmap.get(s).add(strs[i]);
    			
    		}else {
    			List<String> ls = new ArrayList<String>();
    			ls.add(strs[i]);
    			hmap.put(s, ls);
    			//System.out.println(temp);
    			
    		}
    		//System.out.println(hmap.values());
    	}
    
    	Iterator it = hmap.keySet().iterator();
    	List<String> temp2 = new ArrayList<String>();
    	
    	while(it.hasNext()){
    		//System.out.println(it.next());
    		//temp2 = (ArrayList<String>)it.next();
    		result.add(hmap.get(it.next()));
    	}
    
    	 return result;
    	}
    	
  
    }

