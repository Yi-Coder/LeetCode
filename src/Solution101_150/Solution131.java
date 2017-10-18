package Solution101_150;

import java.util.ArrayList;
import java.util.List;

public class Solution131 {
	
    public List<List<String>> partition(String s) {
    	List<List<String>> result = new ArrayList<List<String>>();
    	
    	if (s == null || s.length() == 0) {
    		return result;
    	}
    	ArrayList<String> partition = new ArrayList<String>();//track each possible partition
    	helper(s, 0, result, partition);
     
    	return result;
    }
    
    
 public void helper(String s, int start,  List<List<String>> result, ArrayList<String> partion) {
	 if(start == s.length()){
		 ArrayList<String> tmp = new ArrayList<String>(partion);
		 result.add(tmp);
		 return;
	 } 
	 
	 for(int i = start+1; i <=s.length();i++){
		 if(isPalindrome(s.substring(start,i))){
			 partion.add(s.substring(start,i));
			 helper(s, i, result, partion);
			 partion.remove(partion.size() - 1);
		 }
	 }
	 
    }
    
    
    public boolean isPalindrome(String s){
    	int start = 0; 
    	int end = s.length()-1;
    	
    	while(start<=end){
    		if(s.charAt(start) != s.charAt(end)) return false;
    		start++;
    		end--;
    	}   	
    	return true;
    }

}
