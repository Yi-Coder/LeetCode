import java.util.*;

public class Solution {
	
	 public int lengthOfLongestSubstring(String s) {
	     
	     int maxlength = 1;
	     Set <Character> set = new HashSet<Character>();
	     
	     if(s.length() == 1)
	     {
	    	 maxlength = 1;
	     }else
	     {
	     for(int i =0;i<s.length();i++)
	     {
	         for(int j = i;j<s.length();j++)
	         {
	        	 if(!set.contains(s.charAt(j))){
	        		 set.add(s.charAt(j));
	        	 }else{
	        		 System.out.println(set);
	        		 if(maxlength < set.size())
	        		 {
	        			 maxlength = set.size();
	        		 }
	        		 set.clear(); 
	        		 break;
	        	 }
	         }
	     }
	     }
	     return maxlength;
	    }


}
