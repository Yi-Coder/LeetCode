import java.util.*;

public class Solution13 {
	
	public int romanToInt(String roman){
		
	      TreeMap<String, Integer> roman_numerals = new TreeMap<String, Integer>();   	
	      
	      roman_numerals.put("M", 1000);
	      roman_numerals.put("CM", 900);
	      roman_numerals.put("D", 500);
	      roman_numerals.put("CD", 400);
	      roman_numerals.put("C", 100);
	      roman_numerals.put("XC", 90);
	      roman_numerals.put("L", 50);
	      roman_numerals.put("XL", 40);
	      roman_numerals.put("X", 10);
	      roman_numerals.put("IX", 9);
	      roman_numerals.put("V", 5);
	      roman_numerals.put("IV", 4);
	      roman_numerals.put("I", 1);
	      
	      int sum = 0;
	      
	      for(Map.Entry<String, Integer> entry:roman_numerals.entrySet()){
	    	  if(roman.startsWith(entry.getKey(), 0)){
	    		  sum = entry.getValue()+romanToInt(roman.substring(entry.getKey().length()));
	    	  }
	      }
	      
	      return sum;   
	      
	}

}
