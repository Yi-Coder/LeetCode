import java.util.*;
public class Solution12 {
	
    public String intToRoman (int num) {
    	
      TreeMap<Integer, String> map = new TreeMap<Integer, String>();   	
      map.put(1000, "M");
      map.put(900, "CM");
      map.put(500, "D");
      map.put(400, "CD");
      map.put(100, "C");
      map.put(90, "XC");
      map.put(50, "L");
      map.put(40, "XL");
      map.put(10, "X");
      map.put(9, "IX");
      map.put(5, "V");
      map.put(4, "IV");
      map.put(1, "I");
      
      int l = map.floorKey(num);
      
      String s = "";
      
      if(num == l){
    	  return map.get(num);
      } else 
    	  {
    	  	s = map.get(l)+intToRoman(num-l);
    	  	return s;
    	  }
      
        
    }

}
