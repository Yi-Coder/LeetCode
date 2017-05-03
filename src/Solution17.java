import java.util.HashMap;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution17 {
	
		public  HashMap <Character,List<Character>> map = new HashMap<Character,List<Character>>();
		
		public Solution17(){
			//map.put('1',Arrays.asList(' '));
		    map.put('2',Arrays.asList('a','b','c'));
		    map.put('3',Arrays.asList('d','e','f') );
		    map.put('4',Arrays.asList('g','h','i') );
		    map.put('5',Arrays.asList('j','k','l') );
		    map.put('6',Arrays.asList('m','n','o'));
		    map.put('7',Arrays.asList('p','q','r','s'));
		    map.put('8',Arrays.asList('t','u','v'));
		    map.put('9',Arrays.asList('w','x','y','z') );

			
		}
	
		
	  public List<String> letterCombinations(String digits) {
	    	
	    	    //HashMap <Character,List<Character>> map = new HashMap<Character,List<Character>>();
	    	    //map.put(Arrays.asList(' '), '1');
	    	   
	    	    List<String> result = new ArrayList<String>();
	    	    
	    	    int len = digits.length();
	    	    
	    	    if(len == 0) {
	    	    	return result;
	    	    } 
	    	    
	    	    if(digits.charAt(0) == '1')
	    	    {
	    	    	return letterCombinations(digits.substring(1));
	    	    }
	    	    	
	    	    if(len ==1){
			    	 List<String> temp1 = new ArrayList<String>();
			    	 
			    	 for(Character character : this.map.get(digits.charAt(0))){
			    		 temp1.add(character.toString());
			    	 }
	    	    	
	    	    	return temp1;
	    	    }else{
	    	    	List<Character> s = this.map.get(digits.charAt(0));
	    	    	
	    	    	for(Character c: s){
	    	    		List<String> subr= letterCombinations(digits.substring(1));
	    	    		
	    	    		for(String ss: subr){
	    	    			result.add(c.toString()+ss);
	    	    		}
	    	    		
	    	    	}
	    	    	
	    	    	
	    	    	
	    	    	
	    	    }
	    	    //System.out.println(result);
	    	    return result;
	        
	    }
	    
   


}
