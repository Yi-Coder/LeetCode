package Solution51_100;

import java.util.ArrayList;
import java.util.List;

public class Solution68 {
	   public List<String> fullJustify(String[] words, int maxWidth) {
		   
		   List<String> result = new ArrayList<String>(); 
		   int len = words.length;
		   int i =0;
		   while(i<len){ 
			   List<String> s = new ArrayList<String>();
			   //StringBuilder s = new StringBuilder();   
			   int reallength = 0;
			   int length = 0;	   
			   List<Integer> index = new ArrayList<Integer>();
			   
			   while(i < len && reallength+words[i].length()<= maxWidth ){				  
						  s.add(words[i]);
						  length += words[i].length();
						  index.add(length);						  
						  reallength += words[i].length()+1;
						  i++;						  
	
			   }
			   
			  addspace(index, s,maxWidth);
			   
			  index.clear();

			  result.add(s.toString()); 
		   } 
			   return result;	        
	    }
	   
	   public String addspace(List<Integer> index, List<String> s, int maxWidth){
		   
		   int slot = index.size();
		   int len = s.size();
		   int remaining = maxWidth - len;
		   int spaceadded= 0;
		   
		   if(slot == 1){
			   StringBuilder temp = new StringBuilder(s.get(0));
			   for(int i = 0; i<maxWidth -slot;i++){
				    temp.append(" ");
				   }
			   return temp.toString();
		   } else{
			   StringBuilder temp = new StringBuilder(s.get(0));
			   
			   while(remaining>0){
				   spaceadded = remaining/(slot-1) + 1;
				   index.remove(0);
				   for(Integer i:index){
					   index.set(i, index.get(i)+spaceadded);
				   }
				   
				   remaining = remaining - spaceadded;
			   }
		   }
		   return s.toString();
	   }
}
