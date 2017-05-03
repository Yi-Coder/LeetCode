import java.util.ArrayList;
import java.util.List;

public class Solution22 {
	   public List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<String>();
	        generateString(n,0, 0, "", result);
	        return result;
	        
	    }
	   
	   public void generateString(int n,int left, int right, String com, List<String> result) {
	        if(left == n && right == n)
	        {
	        	result.add(com);
	        	return;
	        }else{
	        	if(left<n){
	  
	        		generateString(n, left+1, right, com+"(", result);
	        	}
	        	
	        	if(right< left && right<n){

	        		generateString(n, left, right+1, com +")", result);
	        	}
	        	
			}    
	    }
	   
  

}
