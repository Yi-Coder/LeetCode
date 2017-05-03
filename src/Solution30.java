
import java.util.*;

public class Solution30 {
	   public List<Integer> findSubstring(String s, String[] words) {
		   List <Integer> result = new ArrayList<Integer>();
		   
		   if (s.isEmpty() || words.length == 0) return result;

		   Map<String, int> Map = Map
		   
		   int listlength = words.length;
		   
		   int wordlength = words[0].length();
		   int strlengh = s.length();
		   ArrayList<String> tempList;

		   for(int i = 0; i <= strlengh - wordlength*listlength; i= i+wordlength){
			   tempList = new ArrayList<String>(Arrays.asList(words));
			   int j = i;
			   while( j <= i+ wordlength*listlength){
				   //System.out.println(tempList.size());
				   if (tempList.isEmpty()) {
					   result.add(i);
					   break;
					   }  
				    String tempstring =  s.substring(j, j+wordlength);
				   if(tempList.contains(tempstring)){
					   System.out.println(tempList);
					   tempList.remove(tempList.indexOf(tempstring));
					    j = j + wordlength;
				   }else{
					   break;
				   }
			   }   
		   }
		   return result;        
	    }

}
